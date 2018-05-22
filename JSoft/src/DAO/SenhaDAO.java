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
import model.Senha;

/**
 *
 * @author 
 */
public class SenhaDAO {
    
    ConectaBanco c = new ConectaBanco();
    Conectar cc = new Conectar();
    Connection cn = cc.conexion();

    public void alterar(Senha s){
        
        try{
            PreparedStatement pst = cn.prepareStatement("update usuario set senha='"+ s.getSenha()+"' where id='"+s.getId()+"'");
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Senha alterada com sucesso!");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao alterar dados: " + e);
        }
        
    }
    
    
}
