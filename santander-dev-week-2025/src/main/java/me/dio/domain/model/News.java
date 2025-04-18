package me.dio.domain.model;

import jakarta.persistence.Entity;

//Definindo News como tabela tb_news no BD
@Entity(name = "tb_news")
public class News extends BaseItem {
}
