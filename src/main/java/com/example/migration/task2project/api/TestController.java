package com.example.migration.task2project.api;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Operation(summary = "Test endpoint")
    @GetMapping("/api/test")
    public String test() {
        return "Swagger works!";
    }
}