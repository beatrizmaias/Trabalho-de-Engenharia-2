/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @
 */
public class Evento {
    
    private int id;
    private String nome;
    private String data;
    private String faixa;

    public Evento(int id){
        this.id = id;
    }
    public Evento(int id, String nome, String data, String faixa) {
        this.id = id;
        this.nome = nome;
        this.data = data;
        this.faixa = faixa;
    }
    public Evento(String nome, String data, String faixa) {
        this.nome = nome;
        this.data = data;
        this.faixa = faixa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getFaixa() {
        return faixa;
    }

    public void setFaixa(String faixa) {
        this.faixa = faixa;
    }
    
    
    
}
