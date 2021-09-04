package com.dio.project.model;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@Builder

public class NivelAcesso {
    private long id;
    private String descricao;

    public NivelAcesso() {
    }
}
