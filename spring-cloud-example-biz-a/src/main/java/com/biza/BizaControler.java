package com.biza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/helloA")
public class BizaControler {

    @Autowired
    private RemoteService remoteService;

    /**
     * 示例方法
     *
     * @return
     */
    @GetMapping
    public String sayHelloA() {
        return "Hello,This is Biz-A Service.";
    }

    /**
     * 调用其他服务示例方法
     * @return
     */
    @GetMapping(path = "/call2b")
    public String BSayHello() {
        return remoteService.sayHello();
    }
}
