package me.dio.domain.model;

import jakarta.persistence.*;

/*
* Feature e News possuiam o mesmo corpo de classe, seguindo o conceito
* DRY foi criado a BaseItem como abstrata para que ambas herdem dela
*/

//Definindo que essa classe poderá ser usada para criar classes com esses atributos
@MappedSuperclass
public abstract class BaseItem {
    //Definindo que o atributo após a declaração será um id
    @Id
    //A PK vai ser gerada automaticamente
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String icon;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
