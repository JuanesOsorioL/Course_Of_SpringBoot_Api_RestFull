package com.icodeap.spring_boot_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ejemplocontroller {

    @GetMapping("/")
    public String saludar() {
        return "hola a todos";
    }

    @GetMapping("/despedida")
    public String despedida() {
        return "Adios!!";
    }


}
