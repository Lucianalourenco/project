package com.dio.project.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder

public class TipoData {
    private long id;
    private String descricao;
}
