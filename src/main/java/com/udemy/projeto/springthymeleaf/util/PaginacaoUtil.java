package com.udemy.projeto.springthymeleaf.util;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PaginacaoUtil<T> {
    
    private int tamanho;
    private int pagina;
    private long totalDePaginas;
    private String direcao;
    private List<T> registros;
}
