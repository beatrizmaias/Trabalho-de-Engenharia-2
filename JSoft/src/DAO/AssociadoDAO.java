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
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Associado;

/**
 *
 * @
 */
public class AssociadoDAO {
    
    ConectaBanco c = new ConectaBanco();
    Conectar cc = new Conectar();
    Connection cn = cc.conexion();

    public void adiciona(Associado a){
        
        try {
            PreparedStatement pst = cn.prepareStatement("insert into associado (nome, cpf, idade, email, endereco, telefone, peso, faixa) values (?, ?, ?, ?, ?, ?, ?, ?)");
            pst.setString(1, a.getNome());
            pst.setString(2, a.getCpf());
            pst.setInt(3, a.getIdade());
            pst.setString(4, a.getEmail());
            pst.setString(5, a.getEndereco());
            pst.setString(6, a.getTelefone());
            pst.setDouble(7, a.getPeso());
            pst.setString(8, a.getFaixa());
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e);
        }

    }
    
    public void excluir(Associado a){
        
        try{
            PreparedStatement pst = cn.prepareStatement("delete from associado where id='"+a.getId()+"'");
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Usuario deletado com sucesso!");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao deletar dados: " + e);
        }
        
    }
    
    public void alterar(Associado a){
        
        try{
            PreparedStatement pst = cn.prepareStatement("update associado set nome='"+ a.getNome() +"', cpf='"+ a.getCpf() +"', idade='"+ a.getIdade() +"', email='"+ a.getEmail() +"', endereco='"+a.getEndereco()+"', telefone='"+a.getTelefone()+"', peso='"+a.getPeso()+"', faixa='"+a.getFaixa()+"' where id='"+a.getId()+"'");
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Usuario alterado com sucesso!");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao alterar dados: " + e);
        }
        
    }
    
    public ArrayList<String> retornaTodos(){
        ArrayList<String> results = new ArrayList<>();
        
        String cmd = "select id from associado";
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