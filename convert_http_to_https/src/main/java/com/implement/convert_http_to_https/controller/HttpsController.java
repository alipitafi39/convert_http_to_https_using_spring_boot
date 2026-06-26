package com.implement.convert_http_to_https.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HttpsController {

    @GetMapping("/test")
    public String test() {
        return "Test API OK";
    }

}