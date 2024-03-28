package com.example.controllersefllearnspring.Controller;

import com.example.controllersefllearnspring.domain.Account;
import com.example.controllersefllearnspring.domain.InstanceParam;
import com.example.controllersefllearnspring.domain.OdInstanceParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {

    @GetMapping("/id")
    public Account sendMessage() {
        InstanceParam instanceParam =
                OdInstanceParam.builder().name("name").address("address").age("age").build();

        OdInstanceParam od = new OdInstanceParam("data");

        return new Account(instanceParam);
    }
}