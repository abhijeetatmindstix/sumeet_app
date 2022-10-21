package com.hello.world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Launcher Activity/Starting point of the application. This class is an entry
 * point of the application. User will be landed here upon launching the
 * application.
 *
 * @author [email]
 */
@RestController
@RequestMapping
public class DemoController {

    @GetMapping("/hello/world")
    public String getHelloWorld() {
        return "HELLO WORLD";
    }
}