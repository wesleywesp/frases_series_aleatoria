package com.desafio.frases.controller;


import com.desafio.frases.DTO.FrasesDTO;
import com.desafio.frases.service.FrasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/series")
public class fraserController {
    @Autowired
    private FrasesService frasesService;

    @GetMapping("/frases")
    private FrasesDTO obterfrases(){
        return frasesService.obterfrases();
    }



}