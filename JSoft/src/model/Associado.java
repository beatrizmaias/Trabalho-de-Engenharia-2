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
public class Associado {
    
    private int id;
    private String nome;
    private String cpf;
    private int idade;
    private String email;
    private String endereco;
    private String telefone;
    private double peso;
    private String faixa;

    public Associado(int id){
        this.id = id;
    }
    
    public Associado(int id, String nome, String cpf, int idade, String email, String endereco, String telefone, double peso, String faixa) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        this.peso = peso;
        this.faixa = faixa;
    }
    public Associado(String nome, String cpf, int idade, String email, String endereco, String telefone, double peso, String faixa) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        this.peso = peso;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getFaixa() {
        return faixa;
    }

    public void setFaixa(String faixa) {
        this.faixa = faixa;
    }
    
    
    
}
