package com.example.springwebdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskBasicDTO {

    private long id;

    private String description;

    private boolean completed;
}
