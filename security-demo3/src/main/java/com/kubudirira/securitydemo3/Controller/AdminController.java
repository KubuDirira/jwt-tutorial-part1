package com.kubudirira.securitydemo3.Controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {


    @GetMapping
    public String get(){
        return "GET : Admin controller";
    }

    @PostMapping
    public String post(){
        return "POST : Admin controller";
    }


    @PutMapping
    public String put(){
        return "PUT : Admin controller";
    }


    @DeleteMapping
    public String delete(){
        return "DELETE : Admin controller";
    }
}
