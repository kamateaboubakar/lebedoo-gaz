package com.lebedoo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
    @RequestMapping(value = "/", produces = "application/json")
    public String index() {
        return "Bienvenue sur l'API de GAZ pour LEBEDOO";
    }
}
