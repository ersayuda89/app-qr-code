package id.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/***********************************************************************************************************
 * Author:  Ersa Yuda Pratama
 * Created: 24/07/2025 15:20
 * About this file : 
 *
 ***********************************************************************************************************/
@Controller
public class HomeControlller {

    @GetMapping("/")
    public String home() {
        return "home"; // file: home.html
    }
}
