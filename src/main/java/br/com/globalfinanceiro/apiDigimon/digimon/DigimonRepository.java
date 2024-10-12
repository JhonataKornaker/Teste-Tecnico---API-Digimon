package br.com.globalfinanceiro.apiDigimon.digimon;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DigimonRepository extends JpaRepository<Digimon, Long> {

    DigimonDTO findByName(String name);
    List<Digimon> findByLevel(String level);
}
