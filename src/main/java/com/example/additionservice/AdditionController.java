package com.example.additionservice;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ms1")
public class AdditionController {

    @GetMapping("/add")
    public String add(
            @RequestParam int a,
            @RequestParam int b) {

        int sum = a + b;

        return "Addition = " + sum;
    }
}
