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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Associado;
import model.Evento;

/**
 *
 * @author Daniel
 */
public class EventoDAO {
    
    ConectaBanco c = new ConectaBanco();
    Conectar cc = new Conectar();
    Connection cn = cc.conexion();
    
    
    public void adiciona(Evento e){
        
        try {

            PreparedStatement pst;
            pst = cn.prepareStatement("insert into evento (nome, data, faixa) values (?, ?, ?)");
            pst.setString(1, e.getNome());
            pst.setString(2, e.getData());
            pst.setString(3, e.getFaixa());
            
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento!"+ex.getMessage());
        }
        
    }
    
    public void excluir(Evento e){
        
        try{
            PreparedStatement pst = cn.prepareStatement("delete from evento where id='"+e.getId()+"'");
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Evento deletado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir evento!");
        }
        
    }
    
    public void alterar(Evento e){
        
        try{
            PreparedStatement pst = cn.prepareStatement("update evento set nome='"+ e.getNome() +"', data='"+ e.getData()+"', faixa='"+ e.getFaixa()+"' where id='"+e.getId()+"'");
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Evento alterado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar evento!");
        }
        
    }

    public ArrayList<String> retornaTodos(){
        ArrayList<String> results = new ArrayList<>();
        
        String cmd = "select id from evento";
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
