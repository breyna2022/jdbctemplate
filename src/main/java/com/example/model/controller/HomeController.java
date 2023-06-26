
package com.example.model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author prof.software
 */
@Controller
public class HomeController {
    
    @GetMapping
    public String index(){
        return "plantilla";
    }
}
