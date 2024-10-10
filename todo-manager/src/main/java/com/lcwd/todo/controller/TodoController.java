package com.lcwd.todo.controller;


import com.lcwd.todo.models.Todo;
import com.lcwd.todo.services.TodoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;


@RequestMapping("/todos")
@RestController
public class TodoController {

Logger logger= LoggerFactory.getLogger(TodoController.class);


@Autowired
private TodoService todoService;
    @PostMapping//post method chlegi todo url mein toh yer chlega
    public ResponseEntity<Todo> createTodoHandler(@RequestBody Todo todo){
        logger.info("Create Todo");
        Date currDate=new Date();
        logger.info("currDate{}", currDate);
        todo.setAddedDate(currDate);

      Todo todo1=  todoService.createTodo(todo);
        return new ResponseEntity<>(todo1, HttpStatus.CREATED);
    }
 @GetMapping
    public ResponseEntity<List<Todo>> getAllTodoHandler(){
        List<Todo> allTodos= (List<Todo>) todoService.AllTodoHandler();
        return new ResponseEntity<>(allTodos,HttpStatus.OK);

    }

    @GetMapping("/{todoId}")
    public ResponseEntity<Todo> getSingleTodoHandler(@PathVariable int todoId){
        Todo todo=todoService.getSingleTodo(todoId);
        return ResponseEntity.ok(todo);

    }
    @PutMapping("/todoId")
   public  ResponseEntity<Todo> updateTodoHandler(@RequestBody Todo todowithnewdetails,@PathVariable int todoId){
      Todo todo=  todoService.updateTodo(todoId,todowithnewdetails);
        return ResponseEntity.ok(todo);
    }
    @DeleteMapping("/todoId")
    public ResponseEntity<String> deleteTodoHandler(@PathVariable int todoId){
        todoService.deleteTodo(todoId);
        return ResponseEntity.ok("Todo is sucessfully deleted");
    }
}
