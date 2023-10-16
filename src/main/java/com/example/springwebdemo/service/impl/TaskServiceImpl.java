package com.example.springwebdemo.service.impl;

import com.example.springwebdemo.entity.Task;
import com.example.springwebdemo.model.TaskCreateDTO;
import com.example.springwebdemo.model.TaskDTO;
import com.example.springwebdemo.repository.TaskRepository;
import com.example.springwebdemo.service.TasksService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TaskServiceImpl implements TasksService {

    private final TaskRepository repository;

    public TaskServiceImpl(TaskRepository repository) {
        this.repository = repository;
    }

    @Override
    public TaskDTO createTask(TaskCreateDTO createDTO) {
        var task = new Task();

        task.setDescription(createDTO.getDescription());
        task.addTags(createDTO.getTags());

        task.setCreatedTime(LocalDateTime.now());
        task.setCompletedTime(null);
        task.setCompleted(false);

        var savedTask = repository.save(task);

        var dto = new TaskDTO();

        dto.setId(savedTask.getId());
        dto.setCompleted(savedTask.isCompleted());
        dto.setCreatedTime(savedTask.getCreatedTime());
        dto.setCompletedTime(savedTask.getCompletedTime());
        dto.setDescription(savedTask.getDescription());
        dto.addTags(savedTask.getTags());

        return dto;
    }
}
