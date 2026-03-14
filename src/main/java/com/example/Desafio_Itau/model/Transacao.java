package com.example.Desafio_Itau.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.management.ConstructorParameters;
import java.time.OffsetDateTime;

@Setter
@Getter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = false)
public class Transacao {
    private double valor;
    private OffsetDateTime dataHora;

    @Override
    public String toString() {
        return "'valor' : " + valor + '\n' +
                "'dataHora' : " + dataHora;

    }
}
