/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argades.arqhexa.taskgpt.application.usecase;

import com.argades.arqhexa.taskgpt.domain.model.Task;
import com.argades.arqhexa.taskgpt.domain.port.TaskRepository;
import com.argades.arqhexa.taskgpt.infraestructure.adapter.out.mapper.TaskMapper;
import com.argades.arqhexa.taskgpt.infraestructure.adapter.out.persistence.TaskEntity;
import java.util.UUID;
import org.springframework.stereotype.Component;

/**
 *
 * @author Marco Aurelio Osorio
 */
@Component
public class CreateTaskUseCase {
    final TaskRepository taskRepository;

    public CreateTaskUseCase(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task create(String description){
        Task task = new Task(UUID.randomUUID(), description, false);
        TaskEntity te = this.taskRepository.save(TaskMapper.domainToEntity(task));
        return TaskMapper.entityToDomain(te);
    }
}
