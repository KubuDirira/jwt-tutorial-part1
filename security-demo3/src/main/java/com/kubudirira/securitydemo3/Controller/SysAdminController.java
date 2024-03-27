package com.kubudirira.securitydemo3.Controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/sysadmin")
public class SysAdminController {


    @GetMapping
    public String get(){
        return "GET : sysadmin controller";
    }

    @PostMapping
    public String post(){
        return "POST : sysadmin controller";
    }


    @PutMapping
    public String put(){
        return "PUT : sysadmin controller";
    }


    @DeleteMapping
    public String delete(){
        return "DELETE : sysadmin controller";
    }

}
