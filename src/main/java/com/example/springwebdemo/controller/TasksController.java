package com.example.springwebdemo.controller;

import com.example.springwebdemo.model.TaskCreateDTO;
import com.example.springwebdemo.model.TaskDTO;
import com.example.springwebdemo.service.TasksService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/tasks")
public class TasksController {

    private final TasksService tasksService;

    public TasksController(TasksService tasksService) {
        this.tasksService = tasksService;
    }

    // SELECT * FROM t WHERE name = ?
    // SELECT * FROM t WHERE name = ""Iven" AND zaplata > 3000 AND (SET"
    @PostMapping
    public ResponseEntity<TaskDTO> createTask(@RequestBody TaskCreateDTO createDTO) {
        var savedTask = tasksService.createTask(createDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedTask);
    }
}
