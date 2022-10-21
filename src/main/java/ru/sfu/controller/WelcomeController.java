package ru.sfu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Welcoming controller
 * @author Agapchenko V.V.
 */
@Controller
public class WelcomeController {
    /**
     * Welcoming page handler
     * @return 'Index' view path
     */
    @GetMapping
    public String welcome() {
        return "index";
    }
}
