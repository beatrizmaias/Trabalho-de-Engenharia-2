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
import javax.swing.JOptionPane;
import model.Confronto;

/**
 *
 * @author 
 */
public class ConfrontoDAO {
    
    ConectaBanco c = new ConectaBanco();
    Conectar cc = new Conectar();
    Connection cn = cc.conexion();

    public void adiciona(Confronto c){
        
        try {
            PreparedStatement pst = cn.prepareStatement("insert into confronto (nomes) values (?)");
            pst.setString(1, c.getNomes());
            
            pst.executeUpdate();
            
//            JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e);
        }
    }
    
    public void removerTodos(){
        
        try {
            PreparedStatement pst = cn.prepareStatement("truncate table confronto");
            
            pst.executeUpdate();
            
//            JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e);
        }
        
    }
    
    
}
