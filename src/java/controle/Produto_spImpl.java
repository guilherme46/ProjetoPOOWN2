/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.Produto_spDao;
import dao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Produto_sp;

/**
 *
 * @author Laboratorio
 */
public class Produto_spImpl implements Produto_spDao{
    Connection conn = ConnectionFactory.getConnection();
    PreparedStatement stmt;
    ResultSet rs;

    @Override
    public void salvar(Produto_sp ps) {
    }

    @Override
    public void alterar(Produto_sp ps) {
    }

    @Override
    public void remover(Produto_sp ps) {
    }

    @Override
    public List<Produto_sp> listAll() {
        List<Produto_sp> list = new ArrayList<>();
        String sql = "SELECT cod_produto,preco,cod_sp FROM produto_sp";
        
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                //popular o objeto
                Produto_sp ps = new Produto_sp();
                ps.setCod_produto(rs.getInt(1));
                ps.setPreco(rs.getDouble(2));
                ps.setCod_sp(rs.getInt(3));
              
                
                //adiciona na lista
                list.add(ps);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Produto_spImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public Produto_sp findById(Produto_sp ps) {
        return null;
    }
    
}
