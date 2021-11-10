package org.example.controller;

import org.example.entity.User;
import org.example.entity.ToDo;
import org.example.service.ToDoService;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    @GetMapping("/news")
    public String userList(Model model) {
        model.addAttribute("allToDos", toDoService.allToDos());
        return "news";
    }

    @PostMapping("/news/delete")
    public String  deleteUser(@RequestParam(required = true, defaultValue = "" ) Long todoId,
                              @RequestParam(required = true, defaultValue = "" ) String action,
                              Model model) {
        if (action.equals("deletetodo")){
            toDoService.deleteToDo(todoId);
        }
        return "redirect:/news";
    }



//
//    @GetMapping("/news")
//    public String registration(Model model) {
//        model.addAttribute("todoForm", new ToDo());
//
//        return "news";
//    }
//
//    @PostMapping("/news")
//    public String addUser(@ModelAttribute("todoForm") @Valid User todoForm, BindingResult bindingResult, Model model) {
//
//        if (bindingResult.hasErrors()) {
//            return "news";
//        }
//        if (!todoForm.getPassword().equals(todoForm.getPasswordConfirm())){
//            model.addAttribute("passwordError", "Пароли не совпадают");
//            return "news";
//        }
//
//
//        return "redirect:/";
//    }
}
