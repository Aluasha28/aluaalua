package org.example.service;

import org.example.entity.Role;
import org.example.entity.ToDo;
import org.example.entity.User;
import org.example.entity.ToDo;
import org.example.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
public class ToDoService {
    @Autowired
    private ToDoRepository toDoRepository;

    public List<ToDo> allToDos() {
        return toDoRepository.findAll();
    }

    public boolean deleteToDo(Long todoId) {
        if (toDoRepository.findById(todoId).isPresent()) {
            toDoRepository.deleteById(todoId);
            return true;
        }
        return false;
    }





//
//    public boolean saveToDo(ToDo todo) {
//        ToDo todoFromDB = toDoRepository.findByToDo(todo.getDescription());
//
//        Date date = new Date();
//        if (todoFromDB != null) {
//            return false;
//        }
//
//        todo.setCreated(date.toString());
//        toDoRepository.save(todo);
//        return true;
//    }

//    public boolean saveToDo(ToDo toDo) {
//        ToDo todoFromDB = toDoRepository.findByToDo(toDo.getDescription());
//
//        Date date = new Date();
//        if (todoFromDB != null) {
//            return false;
//        }
//
//        toDo.setCreated(date.toString());
//        toDoRepository.save(toDo);
//        return true;
//    }

}
