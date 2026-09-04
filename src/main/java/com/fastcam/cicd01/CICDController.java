package com.fastcam.cicd01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CICDController {
    @GetMapping("/")
    public String index() {
        return "<h1>Welcome CICD World</h1>";
    }
}
