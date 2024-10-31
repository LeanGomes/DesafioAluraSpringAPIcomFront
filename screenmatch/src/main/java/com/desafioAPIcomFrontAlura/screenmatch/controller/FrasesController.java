package com.desafioAPIcomFrontAlura.screenmatch.controller;


import com.desafioAPIcomFrontAlura.screenmatch.FraseDTO;
import com.desafioAPIcomFrontAlura.screenmatch.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Indica ao spring que a classe e um controlador
public class FrasesController {

    @Autowired // Injeção de dependência: o Spring gerencia a instância de 'FraseService'
    private FraseService servico;

    @GetMapping("/series/frases")
    public FraseDTO obterFraseAleatoria() {

        return servico.obterFraseAleatoria();

    }


}
