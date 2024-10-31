package com.desafioAPIcomFrontAlura.screenmatch.service;

import com.desafioAPIcomFrontAlura.screenmatch.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseRepository extends JpaRepository <Frase, Long> {

    //Buscar uma fase aleatoria, limitando em 1 frase por vez
    @Query("SELECT f FROM Frase f order by function('RANDOM') LIMIT 1")
    Frase buscarFraseAleatoria();
}
