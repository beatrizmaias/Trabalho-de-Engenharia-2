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
public class Confronto {
    
    private int id;
    private String nomes;

    public Confronto(int id, String nomes) {
        this.id = id;
        this.nomes = nomes;
    }
    
    public Confronto(String nomes){
        this.nomes = nomes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomes() {
        return nomes;
    }

    public void setNomes(String nomes) {
        this.nomes = nomes;
    }
    
    
    
}
