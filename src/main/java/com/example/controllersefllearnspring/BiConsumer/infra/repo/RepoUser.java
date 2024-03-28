package com.example.controllersefllearnspring.BiConsumer.infra.repo;

import com.example.controllersefllearnspring.BiConsumer.core.domain.User;
import org.springframework.stereotype.Service;

@Service
public class RepoUser {
    public void validate(User user){
        System.out.println("User validated");
    }
}
