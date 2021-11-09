package org.example.repository;

import org.example.entity.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.SQLException;
import java.util.List;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {

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
