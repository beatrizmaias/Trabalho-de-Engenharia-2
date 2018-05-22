/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexao.ConectaBanco;
import conexao.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Evento;
import model.EventoParticipante;

/**
 *
 * @author 
 */
public class EventoParticipanteDAO {
    
    ConectaBanco c = new ConectaBanco();
    Conectar cc = new Conectar();
    Connection cn = cc.conexion();
    
    
    public void adiciona(EventoParticipante e){
        
        try {

            PreparedStatement pst;
            pst = cn.prepareStatement("insert into evento_participante (id_participante, id_evento) values (?, ?)");
            pst.setInt(1, e.getId_participante());
            pst.setInt(2, e.getId_evento());
            
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Participante inserido com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento!");
        }
        
    }
    
    public void excluir(EventoParticipante e){
        
        try{
            PreparedStatement pst = cn.prepareStatement("delete from evento_participante where id='"+e.getId()+"'");
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Participante deletado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir evento!");
        }
        
    }
    
    public void alterar(EventoParticipante e){
        
        try{
            PreparedStatement pst = cn.prepareStatement("update evento_participante set id_participante='"+ e.getId_participante() +"', id_evento='"+ e.getId_evento()+"' where id='"+e.getId()+"'");
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Participante alterado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar evento!");
        }
        
    }

    public ArrayList<String> retornaTodos(){
        ArrayList<String> results = new ArrayList<>();
        
        String cmd = "select id from evento_participante";
        Statement stmt;
        ResultSet dados=null;
        c.conexao();
        try {
            stmt = c.conn.prepareStatement(cmd);
            dados = stmt.executeQuery(cmd);
            while(dados.next()){
                String usuario = dados.getString(1);
                results.add(usuario);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
        
        return results;
    }    
    
}
