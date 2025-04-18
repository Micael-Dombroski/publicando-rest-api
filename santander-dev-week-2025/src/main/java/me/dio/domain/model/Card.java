package me.dio.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

//Definindo Card como tabela tb_card no BD
@Entity(name = "tb_card")
public class Card {
    //Definindo que o atributo após a declaração será um id
    @Id
    //A PK vai ser gerada automaticamente
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //Número do cartão é único, impossibilitando valores repetidos na tabela
    @Column(unique = true)
    private String number;
    /*
        Certos BDs podem ter "limit" como palavra reservada, então
        atribuimos outro nome para essa coluna na tabela
    */
    //precision = qtd de digitos
    //scale = qtd de decimais (ou seja, 11 inteiros e 2 decimais = 13 digitos)
    @Column(name = "available-limit", precision = 13, scale = 2)
    private BigDecimal limit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}
