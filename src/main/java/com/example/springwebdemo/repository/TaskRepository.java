package com.example.springwebdemo.repository;

import com.example.springwebdemo.entity.Task;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class TaskRepository {

    private AtomicLong nextId = new AtomicLong(0);

    private Map<Long, Task> storage = new HashMap<>();

    public Task save(Task task) {
        var id = nextId.getAndIncrement();
        task.setId(id);
        storage.put(task.getId(), task);
        return task;
    }
}
