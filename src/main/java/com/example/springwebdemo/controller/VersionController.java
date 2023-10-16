package com.example.springwebdemo.controller;

import com.example.springwebdemo.model.InfoDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@Slf4j
@RestController
@RequestMapping("/api/info")
public class VersionController {

    @GetMapping("/version") // GET /api/info/version
    public String version() {
        return "1.0.0";
    }

    @GetMapping// GET /api/info
    public InfoDTO info() {
        return new InfoDTO("1.0.0", LocalDateTime.now());
    }
}
