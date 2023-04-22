package com.argades.poker.pokerchallenge.infraestructure.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class)
@WebAppConfiguration
public class SpringContextIT {
    
    @Test
    public void whenSpringContextIsBootstrapped_thenNoException(){

    }
}
