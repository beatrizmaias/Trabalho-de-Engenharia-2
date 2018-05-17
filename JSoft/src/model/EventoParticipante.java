/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Daniel
 */
public class EventoParticipante {
    
    private int id;
    private int id_evento;
    private int id_participante;

    public EventoParticipante(int id, int id_evento, int id_participante) {
        this.id = id;
        this.id_evento = id_evento;
        this.id_participante = id_participante;
    }

    public EventoParticipante(int id_evento, int id_participante) {
        this.id_evento = id_evento;
        this.id_participante = id_participante;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_evento() {
        return id_evento;
    }

    public void setId_evento(int id_evento) {
        this.id_evento = id_evento;
    }

    public int getId_participante() {
        return id_participante;
    }

    public void setId_participante(int id_participante) {
        this.id_participante = id_participante;
    }
    
    
    
}
