package com.krzywdek19.ecommerce.controller;

import com.krzywdek19.ecommerce.response.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public ApiResponse home(){
        return new ApiResponse("Hello World");
    }
}
