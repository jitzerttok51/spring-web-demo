package com.example.springwebdemo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
public class TaskCreateDTO {

    private String description;

    private Set<String> tags;
}
