package br.com.slmm.aula1603;

import org.springframework.web.bind.annotation.*;


@RestController
//@RequestMapping("/api")
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
    public String getPorNome(@PathVariable String nome) {
        return "ola, Sr(a) " + nome + "!";
    }
    

	// Maps to -> GET http://localhost:8080/api/search?name=someName
    @RequestMapping(value = "/search", method = RequestMethod.GET, params = {"name"})
    public String searchUserByName(@RequestParam("name") String name) {
        return "Searching for user with name: " + name;
    }

    // Maps to -> GET http://localhost:8080/api/pesquisa?name=someName
    @GetMapping(value = "/pesquisa", params = {"name"})
    public String searchUserByName2(@RequestParam("name") String name) {
        return "Searching for user with name: " + name;
    }

    
}

