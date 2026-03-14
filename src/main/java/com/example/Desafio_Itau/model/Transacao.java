package com.example.Desafio_Itau.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.management.ConstructorParameters;
import java.time.OffsetDateTime;

@Setter
@Getter
@NoArgsConstructor
public class Transacao {
    private double valor;
    private OffsetDateTime dataHora;
}
