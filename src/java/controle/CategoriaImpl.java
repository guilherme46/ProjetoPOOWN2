/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.CategoriaDao;
import dao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Categoria;

/**
 *
 * @author Laboratorio
 */
public class CategoriaImpl implements CategoriaDao{
    Connection conn = ConnectionFactory.getConnection();
    PreparedStatement stmt;
    ResultSet rs;

    @Override
    public void salvar(Categoria c) {
    }

    @Override
    public void alterar(Categoria c) {
    }

    @Override
    public void remover(Categoria c) {
    }

    @Override
    public List<Categoria> listAll() {
        List<Categoria> list = new ArrayList<>();
        String sql = "SELECT cod_cat, nome FROM categoria";
        
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                //popular o objeto
                Categoria c = new Categoria();
                c.setCod_cat(rs.getInt(1));
                c.setNome(rs.getString(2));
                
                //adiciona na lista
                list.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public Categoria findById(Categoria c) {
        return null;
    }
    
}
