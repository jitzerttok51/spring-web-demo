package com.example.springwebdemo.service;

import com.example.springwebdemo.model.TaskBasicDTO;
import com.example.springwebdemo.model.TaskCreateDTO;
import com.example.springwebdemo.model.TaskDTO;

import java.util.List;
import java.util.Set;

public interface TasksService {

    TaskDTO createTask(TaskCreateDTO createDTO);

    List<TaskBasicDTO> listTasks();
}
