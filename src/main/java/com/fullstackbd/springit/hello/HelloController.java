package com.fullstackbd.springit.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloController {

    /**
     * Get the hello message
     * @return
     */
    @GetMapping("/")
    public Hello hello() {
        return new Hello("Hello!");
    }

    /**
     * Get the hello message with a name
     * @param name
     * @return
     */
    @GetMapping("/{name}")
    public Hello helloName(@PathVariable("name") String name) {
        return new Hello("Hello, " + name);
    }

}
