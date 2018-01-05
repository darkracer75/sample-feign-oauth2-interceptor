package com.sample.feign.oauth2.interceptor;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class PersonController {

    private PersonFeignClient personFeignClient;
    private OrderFeignClient orderFeignClient;

    @GetMapping("/persons")
    public List<Person> listPersons() {
        return personFeignClient.list();
    }

    @GetMapping("/orders")
    public List<Order> listOrders() {
        return orderFeignClient.list();
    }
}
