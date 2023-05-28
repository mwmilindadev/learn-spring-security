package com.springsecurity.learnspringsecurity.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ToDos {

    private Logger logger= LoggerFactory.getLogger(getClass());
    public static final List<ToDo> TO_DO_LIST = List.of(new ToDo("mw", "LearAWS")
            , new ToDo("WM", "LearAWS CERTIFIED"));

    @GetMapping("/todos")
    public List<ToDo> retrieveAll(){
        return TO_DO_LIST;
    }

    @GetMapping("/users/{userName}/todos")
    public ToDo retrieveForSpecificUser(@PathVariable String userName){
        return TO_DO_LIST.get(0);
    }

    @PostMapping("/users/{userName}/todos")
    public void saveForSpecificUser(@PathVariable String userName, @RequestBody ToDo toDo){
        logger.info("Create {}",toDo,userName);
    }
}

record ToDo(String user,String description){}