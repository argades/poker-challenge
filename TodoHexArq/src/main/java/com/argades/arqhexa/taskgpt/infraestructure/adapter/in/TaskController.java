/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argades.arqhexa.taskgpt.infraestructure.adapter.in;

import com.argades.arqhexa.taskgpt.application.usecase.CreateTaskUseCase;
import com.argades.arqhexa.taskgpt.domain.model.Task;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Marco Aurelio Osorio
 */
@RestController("/api/")
public class TaskController {
    final CreateTaskUseCase createTaskUseCase;

    public TaskController(CreateTaskUseCase createTaskUseCase) {
        this.createTaskUseCase = createTaskUseCase;
    }
    
    @PostMapping("/tasks")
    public Task createTask(@RequestBody String description){
        return createTaskUseCase.create(description);
    }
}
