package me.dio.domain.model;

import jakarta.persistence.*;

import java.util.List;
//Definindo User como tabela tb_user no BD
@Entity(name = "tb_user")
public class User {
    //Definindo que o atributo após a declaração será um id
    @Id
    //A PK vai ser gerada automaticamente
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    //Cria relação 1 para 1 fazendo uma chave estrangeira de Account na tb_user
    @OneToOne(cascade = CascadeType.ALL)
    private Account account;
    //Cria relação 1 para 1 fazendo uma chave estrangeira de Account na tb_user
    @OneToOne(cascade = CascadeType.ALL)
    private Card card;
    //Cria relação 1 para muitos fazendo uma chave estrangeira de Account na tb_user
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Feature> features;
    //Cria relação 1 para muitos fazendo uma chave estrangeira de Account na tb_user
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<News> news;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }
}
