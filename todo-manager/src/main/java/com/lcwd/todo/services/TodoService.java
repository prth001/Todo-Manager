package com.lcwd.todo.services;


import com.lcwd.todo.models.Todo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

//import static java.util.stream.Nodes.collect;


@Component
public class TodoService {

    Logger logger= (Logger) LoggerFactory.getLogger(TodoService.class);
    List<Todo> todos =new ArrayList<>();
    Random random=new Random();

  public Todo createTodo(Todo todo){
      int id= random.nextInt(9999999);
      todo.setId(id);
      todos.add(todo);
      logger.info("Todos {}" ,this.todos);
      return todo;

  }

    public List<Todo> AllTodoHandler() {
      return  todos;
    }

    public Todo getSingleTodo(int todoId) {
     Todo todo= todos.stream().filter(t->todoId==t.getId()).findAny().get();
     logger.info("todo{}",todo);
     return todo;

    }
    public  Todo updateTodo(int todoId,Todo todo){
   List<Todo>updatedList=   todos.stream().map(t -> {
          if(t.getId()==todoId) {
              t.setTitle(todo.getTitle());
              t.setContent(todo.getContent());
              t.setStatus(todo.getStatus());
              return t;
          }else{
              return t;
          }
        }).collect(Collectors.toList());
   todos=updatedList;
      todo.setId(todoId);
      return todo;

    }

    public void deleteTodo(int todoId) {
      logger.info("Delete todo");
      List<Todo> newList=todos.stream().filter(t -> t.getId()!=todoId).collect(Collectors.toList());
      todos=newList;

    }
}
