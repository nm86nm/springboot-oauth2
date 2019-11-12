package com.mnp.springbootoauth2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {
    @GetMapping("/not-secure")
    public String notSecure(){
        return "This is not secure method. Everyone has access.";
    }

    @GetMapping("/need-authorize")
    public String needAuthorised(){
        return "This method need authorized.";
    }
}
