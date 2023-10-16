package com.example.springwebdemo.service;

import com.example.springwebdemo.model.TaskCreateDTO;
import com.example.springwebdemo.model.TaskDTO;

public interface TasksService {

    TaskDTO createTask(TaskCreateDTO createDTO);
}
