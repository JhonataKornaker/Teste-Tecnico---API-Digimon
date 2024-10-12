package br.com.globalfinanceiro.apiDigimon.digimon;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "digimon")
@Entity(name = "Digimon")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Digimon {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String img;
    private String level;
}
