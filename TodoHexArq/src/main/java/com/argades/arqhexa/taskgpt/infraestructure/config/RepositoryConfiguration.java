/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argades.arqhexa.taskgpt.infraestructure.config;

import com.argades.arqhexa.taskgpt.domain.port.TaskRepository;
import com.argades.arqhexa.taskgpt.infraestructure.adapter.out.repo.JpaTaskRepositoryAdapter;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author Marco Aurelio Osorio
 */
public class RepositoryConfiguration {

    @Bean
    public TaskRepository taskRepository(JpaTaskRepositoryAdapter jpaTaskRepositoryAdapter){
        return jpaTaskRepositoryAdapter;
    }
}
