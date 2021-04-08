package com.niajobot.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NativeController {

    @GetMapping("/native")
    public String nativeCall() {
        return "Native";
    }
}
