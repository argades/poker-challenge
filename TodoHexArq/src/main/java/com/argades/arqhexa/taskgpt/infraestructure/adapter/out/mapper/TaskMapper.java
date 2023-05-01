/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argades.arqhexa.taskgpt.infraestructure.adapter.out.mapper;

import com.argades.arqhexa.taskgpt.domain.model.Task;
import com.argades.arqhexa.taskgpt.infraestructure.adapter.out.persistence.TaskEntity;

/**
 *
 * @author Marco Aurelio Osorio
 */
public class TaskMapper {
    
    public static Task entityToDomain(TaskEntity taskEntity){
        Task task = new Task(taskEntity.getId(), taskEntity.getDescription(), taskEntity.isCompleted());
        return task;
    }
    
    public static TaskEntity domainToEntity(Task task){
        TaskEntity taskEnt = new TaskEntity(task.getId(), task.getDescription(), task.isCompleted());
        return taskEnt;
        
    }
}
