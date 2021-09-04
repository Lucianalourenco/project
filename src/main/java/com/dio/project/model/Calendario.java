package com.dio.project.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@Builder


public class Calendario {
    private long id;
    private TipoData tipoData;
    private String descricao;
    private LocalDateTime dataEspecial;

    public Calendario() {
    }
}
