/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Laecio
 */
public class Evento {
    
    private int id;
    private String nome;
    private String data;
    private String faixa;
    private double valor;

    public Evento(){
    }
    
    public Evento(int id){
        this.id = id;
    }
    public Evento(int id, String nome, String data, String faixa, double valor) {
        this.id = id;
        this.nome = nome;
        this.data = data;
        this.faixa = faixa;
        this.valor = valor;
    }
    public Evento(String nome, String data, String faixa, double valor) {
        this.nome = nome;
        this.data = data;
        this.faixa = faixa;
        this.valor = valor;
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
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
