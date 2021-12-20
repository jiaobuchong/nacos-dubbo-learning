package com.gupaoedu.example.nacosdubboprovider.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope  // spring 中的注解，表示当前类中的属性，需要动态刷新
@RestController
public class ConfigController {

    @Value("${info:hello jaxson}")
    private String info;

    @GetMapping("/get")
    public String get() {
        return info;
    }
}
