package com.desafioAPIcomFrontAlura.screenmatch.service;

import com.desafioAPIcomFrontAlura.screenmatch.FraseDTO;
import com.desafioAPIcomFrontAlura.screenmatch.model.Frase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // Indica que esta classe é um serviço do Spring, permitindo a injeção e uso em outras partes do sistema.
public class FraseService {

    @Autowired // Injeção de dependência: o Spring gerencia a instância de 'FraseRepository'
    private FraseRepository repositorio;


    public FraseDTO obterFraseAleatoria() {

        Frase frase = repositorio.buscarFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
