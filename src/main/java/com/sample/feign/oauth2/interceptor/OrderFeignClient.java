package com.sample.feign.oauth2.interceptor;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "orderFeignClient", url = "http://localhost:8090", configuration = OrderFeignClientConfiguration.class)
public interface OrderFeignClient {

    @GetMapping("/orders")
    List<Order> list();
}


