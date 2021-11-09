package org.example.service;

import org.example.entity.ToDo;
import org.example.entity.User;
import org.example.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {
    @Autowired
    private ToDoRepository toDoRepository;

    public List<ToDo> allUToDos() {
        return toDoRepository.findAll();
    }

}
