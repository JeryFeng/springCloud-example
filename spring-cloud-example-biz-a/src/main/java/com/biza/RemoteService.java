package com.biza;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "spring-cloud-example-biz-b")
public interface RemoteService {

    /**
     * 远程调用服务B的hello方法
     *
     * @return
     */
    @GetMapping("/hello")
    String sayHello();
}