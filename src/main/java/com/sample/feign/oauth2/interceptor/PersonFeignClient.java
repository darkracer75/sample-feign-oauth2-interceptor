package com.sample.feign.oauth2.interceptor;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "personFeignClient", url = "http://localhost:8090")
public interface PersonFeignClient {

    @GetMapping("/persons")
    List<Person> list();
}


