package com.udemy.projeto.springthymeleaf.util;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class PaginacaoUtil<T> {
    
    private int tamanho;
    private int pagina;
    private long totalDePaginas;
    private List<T> registros;
}
