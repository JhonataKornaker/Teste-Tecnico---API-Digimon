package br.com.globalfinanceiro.apiDigimon.controller;

import br.com.globalfinanceiro.apiDigimon.digimon.Digimon;
import br.com.globalfinanceiro.apiDigimon.digimon.DigimonDTO;
import br.com.globalfinanceiro.apiDigimon.digimon.DigimonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/digimon")
public class DigimonController {

    @Autowired
    private DigimonRepository repository;

    @GetMapping("/")
    public ResponseEntity<List<DigimonDTO>> getFindAll() {
        List<Digimon> digimons = repository.findAll();

        if(digimons.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        List<DigimonDTO> digimonDTOS = digimons.stream()
                .map(DigimonDTO::new)
                .collect(Collectors.toList());

        return ResponseEntity.ok(digimonDTOS);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<DigimonDTO> getFindByName(@PathVariable String name) {
        var digimons = repository.findByName(name);

        if(digimons == null) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(digimons);
    }

    @GetMapping("/level/{level}")
    public ResponseEntity<List<DigimonDTO>> getFindByLevel(@PathVariable String level) {
        List<Digimon> digimons = repository.findByLevel(level);

        if(digimons.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        List<DigimonDTO> digimonDTOS = digimons.stream()
                .map(DigimonDTO::new)
                .collect(Collectors.toList());

        return ResponseEntity.ok(digimonDTOS);
    }
}
