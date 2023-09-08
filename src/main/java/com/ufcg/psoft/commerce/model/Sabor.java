package com.ufcg.psoft.commerce.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "sabores")
public class Sabor {
    @Id
    @JsonProperty("id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @JsonProperty("nome")
    String nome;

    @JsonProperty("tipo")
    String tipo;

    @JsonProperty("precoM")
    double precoM;

    @JsonProperty("precoG")
    double precoG;

    @JsonProperty("disponivel")
    Boolean disponivel;

    @ManyToOne
    @JoinColumn(name = "estabelecimento_id")
    private Estabelecimento estabelecimento;

    public Boolean isDisponivel() {
        return disponivel;
    }
}
