package br.com.globalfinanceiro.apiDigimon.digimon;

public record DigimonDTO(String name, String img, String level) {
    public DigimonDTO(Digimon digimon) {
        this(digimon.getName(), digimon.getImg(), digimon.getLevel());
    }
}

