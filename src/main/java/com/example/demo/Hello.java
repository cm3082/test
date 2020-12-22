package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * des
 * </p>
 *
 * @author cm
 * @since 2020/12/21
 */
@RestController
public class Hello {

    @RequestMapping("hello")
    public String Hello() {
        return "hello";
    }
}
