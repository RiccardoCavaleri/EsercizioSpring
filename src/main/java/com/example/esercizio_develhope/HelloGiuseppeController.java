package com.example.esercizio_develhope;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1")
public class HelloGiuseppeController {

    @GetMapping(path="/ciao")
    public String ciao(@RequestParam String nome, @RequestParam String provincia) {
        return "Ciao " + nome + " com'è il tempo in " + provincia + "?";
    }
}