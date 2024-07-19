package com.example.Todo_azure;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/todo")
public class TodoController {

    private List<Todo> todos = new ArrayList<>();

    @GetMapping("/all")
    public ResponseEntity<List<Todo>> getAllTodos(){
        if(todos.isEmpty()){
            Todo t1 = new Todo(
                    UUID.randomUUID(),
                    "todo1"
            );

            Todo t2 = new Todo(
                    UUID.randomUUID(),
                    "todo2"
            );

            todos.add(t1);
            todos.add(t2);
        }

        return new ResponseEntity<>(todos, HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<Todo> addTodo(@RequestBody Map<String, String> m1){
        Todo t = new Todo(
                UUID.randomUUID(),
                m1.get("text")
        );

        todos.add(t);

        return new ResponseEntity<>(t, HttpStatus.OK);

    }

}
