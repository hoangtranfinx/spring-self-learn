package com.example.controllersefllearnspring.BiConsumer.core.service;

import com.example.controllersefllearnspring.BiConsumer.core.domain.Type;
import com.example.controllersefllearnspring.BiConsumer.core.domain.User;
import com.example.controllersefllearnspring.BiConsumer.infra.repo.RepoAdmin;
import com.example.controllersefllearnspring.BiConsumer.infra.repo.RepoUser;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final RepoAdmin repoAdmin;
    private final RepoUser repoUser;

    @Bean
    public void test(){
        doSomething();
    }

    public void doSomething(){
        User user = new User("hoang","24","ton dan", Type.ADMIN);
        validateAdmin(user);

        User user2 = new User("huy","24","adress", Type.USER);
        validateUser(user2);
    }

    public void validateAdmin(User user){
        repoAdmin.validate(user);
    }

    public void validateUser(User user){
        repoUser.validate(user);
    }
}
