package com.programem.viajantes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CursoresolucaoController {
    

    
    @GetMapping("/cursoresolucao")
    public String cursoresolucao(){
        return "cursoresolucao";
    }
}