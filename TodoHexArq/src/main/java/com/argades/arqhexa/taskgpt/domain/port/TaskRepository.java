/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.argades.arqhexa.taskgpt.domain.port;

import com.argades.arqhexa.taskgpt.infraestructure.adapter.out.persistence.TaskEntity;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 *
 * @author Marco Aurelio Osorio
 */
public interface TaskRepository {
    TaskEntity save(TaskEntity task);
    Optional<TaskEntity> findById(UUID id);
    List<TaskEntity> findAll();
    void deleteById(UUID id);
}
