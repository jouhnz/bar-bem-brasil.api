package com.barbembrasil.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToOne(cascade = CascadeType.ALL)
    private Bebidas bebidas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

	public Bebidas getBebidas() {
		return bebidas;
	}

	public void setBebidas(Bebidas bebidas) {
		this.bebidas = bebidas;
	}

   

}