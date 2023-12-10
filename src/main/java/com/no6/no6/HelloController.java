package com.no6.no6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        ArrayList<String> greet = new ArrayList<>();
        greet.add("Hello world");
        greet.add("Hei maailma");
        greet.add("Bonjour le monde");
        greet.add("こんにちは　世界");
        Collections.shuffle(greet);
        return greet.get(1);
    }
}