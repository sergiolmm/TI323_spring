package br.com.slmm.aula1603;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class OlaController {

    // tela na raiz
    @RequestMapping(method = RequestMethod.GET)
    public String ola() {
        return "Alo Mundo de TI...";
    }

    @GetMapping("/ola")
    public String getOla() {
        return "Ola para voce :) ";
    }
   
    @GetMapping("/ola/{nome}")
    public String getPorNome(@PathVariable String param) {
        return "ola, Sr(a) " + param + "!";
    }
    
	

    
}

