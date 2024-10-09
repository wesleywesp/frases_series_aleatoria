package com.desafio.frases.service;

import com.desafio.frases.DTO.FrasesDTO;
import com.desafio.frases.model.Frase;
import com.desafio.frases.repository.FrasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FrasesService {
    @Autowired
    private FrasesRepository frasesRepository;

    public FrasesDTO obterfrases(){
        Frase frases =frasesRepository.findByRandom();
        FrasesDTO frasesDTO = new FrasesDTO(frases.getTitulo(),frases.getPersonagem(),frases.getPoster(),frases.getFrase());
        return frasesDTO;

    }

}
