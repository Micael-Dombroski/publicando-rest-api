package me.dio.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//Definindo Account como tabela tb_account no BD
@Entity(name = "tb_account")
public class Account {
    //Definindo que o atributo após a declaração será um id
    @Id
    //A PK vai ser gerada automaticamente
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //Valor da conta é único, impossibilitando valores repetidos na tabela
    @Column(unique = true)
    private String number;
    private String agency;
    //precision = qtd de digitos
    //scale = qtd de decimais (ou seja, 11 inteiros e 2 decimais = 13 digitos)
    @Column(precision = 13, scale = 2)
    private BigDecimal balance;
    /*
        Certos BDs podem ter "limit" como palavra reservada, então
        atribuimos outro nome para essa coluna na tabela
    */
    //precision = qtd de digitos
    //scale = qtd de decimais (ou seja, 11 inteiros e 2 decimais = 13 digitos)
    @Column(name = "account_limit", precision = 13, scale = 2)
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

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}
