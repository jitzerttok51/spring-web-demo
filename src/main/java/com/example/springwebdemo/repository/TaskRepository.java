package com.example.springwebdemo.repository;

import com.example.springwebdemo.entity.Task;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;

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

    public Stream<Task> findAll() {
        return storage.values().stream();
    }
}
