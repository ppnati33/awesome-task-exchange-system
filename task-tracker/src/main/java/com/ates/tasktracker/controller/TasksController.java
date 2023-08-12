package com.ates.tasktracker.controller;

import com.ates.tasktracker.service.TaskService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequiredArgsConstructor
@RestController
@Slf4j
//@RequestMapping("tasks")
public class TasksController {

    private final TaskService taskService;

    @GetMapping("/hello")
    Map<String, String> home() {
        log.info("accessing /home");
        return taskService.home();
    }

    @GetMapping("/user")
    Map<String, String> user() {
        log.info("accessing /user");
        return taskService.user();
    }

    @GetMapping("/admin")
    Map<String, String> admin() {
        log.info("accessing /admin");
        return taskService.admin();
    }

}
