package org.example.controller;

import org.example.entity.User;
import org.example.service.ToDoService;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewsController {

    @Autowired
    private ToDoService toDoService;

    @GetMapping("/news")
    public String userList(Model model) {
        model.addAttribute("allToDos", toDoService.allUToDos());
        return "news";
    }
}
