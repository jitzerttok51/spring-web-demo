package com.example.springwebdemo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Data
@NoArgsConstructor
public class Task {

    private long id;

    private String description;

    private boolean completed;

    private LocalDateTime createdTime;

    private LocalDateTime completedTime;

    private List<String> tags = new ArrayList<>();

    public void addTag(String tag) {
        tags.add(tag);
    }

    public void addTags(Collection<String> tag) {
        tags.addAll(tag);
    }
}
