package com.fastcam.cicd01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CICDController {
    @GetMapping("/")
    public String index() {
        return "<h1>이제 수정 내용이 잘 배포됩니다.</h1>";
    }
}
