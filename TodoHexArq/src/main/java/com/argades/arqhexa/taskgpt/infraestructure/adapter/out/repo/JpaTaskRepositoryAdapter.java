/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.argades.arqhexa.taskgpt.infraestructure.adapter.out.repo;

import com.argades.arqhexa.taskgpt.domain.port.TaskRepository;
import com.argades.arqhexa.taskgpt.infraestructure.adapter.out.persistence.TaskEntity;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Marco Aurelio Osorio
 */
public interface JpaTaskRepositoryAdapter extends JpaRepository<TaskEntity, UUID>, TaskRepository {
    @Override
    default TaskEntity save(TaskEntity taskEntity){
        return save(taskEntity);
    }
    
    @Override
    default Optional<TaskEntity> findById(UUID id){
        return findById(id);
    }
    
    @Override
    default List<TaskEntity> findAll(){
        return findAll();
    }
    
    @Override
    default void deleteById(UUID id){
        deleteById(id);
    }
}
