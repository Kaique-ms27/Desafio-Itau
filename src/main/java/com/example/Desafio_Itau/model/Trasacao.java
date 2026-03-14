package com.example.Desafio_Itau.model;

import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Setter
@Getter
public class Trasacao {
    private double valor;
    private OffsetDateTime dataHora;
}
