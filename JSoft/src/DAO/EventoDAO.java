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
 * @author Laecio
 */
public class EventoDAO {
    
    ConectaBanco c = new ConectaBanco();
    Conectar cc = new Conectar();
    Connection cn = cc.conexion();
    
    
    public boolean adiciona(Evento e){
        
        if(camposVazios(e) && verificaNumsDadata(e) && verificaQtdNumsData(e) && nomeEventoTest(e)){
            try {

                PreparedStatement pst;
                pst = cn.prepareStatement("insert into evento (nome, data, faixa, valor) values (?, ?, ?, ?)");
                pst.setString(1, e.getNome());
                pst.setString(2, e.getData());
                pst.setString(3, e.getFaixa());
                pst.setDouble(4, e.getValor());

                pst.executeUpdate();

                //JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento!"+ex.getMessage());
            }
            return true;
        }else{
            return false;
        }
        
    }
    
    
    public boolean camposVazios(Evento e){
        if(e.getData().equals("") || e.getFaixa().equals("") || e.getNome().equals("")){
            return false;
        }else{
            return true;
        }
    }
    
    public boolean verificaNumsDadata(Evento e){
        for (int i = 0; i < e.getData().length(); i++) {
            if (!Character.isDigit(e.getData().charAt(i))) {
                return false;
            }
        }
        return true;
    }
    
    public boolean verificaQtdNumsData(Evento e){
        if(e.getData().length()!=8){
            return false;
        }else{
            return true;
        }
    }
    
    public boolean nomeEventoTest(Evento e){
        if (e.getNome().length() <3)
            return false;
        else
            return true;
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
            PreparedStatement pst = cn.prepareStatement("update evento set nome='"+ e.getNome() +"', data='"+ e.getData()+"', faixa='"+ e.getFaixa()+"', valor='"+e.getValor()+"'  where id='"+e.getId()+"'");
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Evento alterado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar evento!");
        }
        
    }

    public ArrayList<Evento> retornaTodos(){
        ArrayList<Evento> results = new ArrayList<>();
        
        String cmd = "select * from evento";
        Statement stmt;
        ResultSet dados=null;
        c.conexao();
        try {
            stmt = c.conn.prepareStatement(cmd);
            dados = stmt.executeQuery(cmd);
            while(dados.next()){
                int id = dados.getInt(1);
                String nome = dados.getString(2);
                String data = dados.getString(3);
                String faixa = dados.getString(4);
                double valor = dados.getDouble(5);
                
                Evento e = new Evento(id, nome, data, faixa, valor);
                results.add(e);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
        
        return results;
    }    
    
}
