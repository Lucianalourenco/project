package com.dio.project.model;

import lombok.*;

import javax.persistence.OneToMany;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder

public class Localidade {
    public long id;
    @OneToMany
    private NivelAcesso nivelAcesso;
    private String descricao;
}
