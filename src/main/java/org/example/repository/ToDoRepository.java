package org.example.repository;

import org.example.entity.ToDo;
import org.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.SQLException;
import java.util.List;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {
//
//    ToDo findByToDo(String description);
//    void insertTodo(ToDo todo) throws SQLException;
//
//    ToDo selectTodo(long todoId);
//
//    List<ToDo> selectAllTodos();
//
//    boolean deleteTodo(int id) throws SQLException;
//
//    boolean updateTodo(ToDo todo) throws SQLException;

}
