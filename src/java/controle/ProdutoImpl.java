/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.ProdutoDao;
import dao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Produto;

/**
 *
 * @author Laboratorio
 */
public class ProdutoImpl implements ProdutoDao{
    Connection conn = ConnectionFactory.getConnection();
    PreparedStatement stmt;
    ResultSet rs;

    @Override
    public void salvar(Produto p) {
    }

    @Override
    public void alterar(Produto p) {
    }

    @Override
    public void remover(Produto p) {
    }

    @Override
    public List<Produto> listAll() {
        List<Produto> list = new ArrayList<>();
        String sql = "SELECT cod_produto, nome, cod_barras, kg, marca_cod_marca, cod_cat FROM produto";
        
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                //popular o objeto
                Produto p = new Produto();
                p.setCod_produto(rs.getInt(1));
                p.setNome(rs.getString(2));
                p.setCod_barras(rs.getString(3));
                p.setKg(rs.getDouble(4));
                p.setMarca_cod_marca(rs.getInt(5));
                p.setCod_cat(rs.getInt(6));
                
                //adiciona na lista
                list.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public Produto findById(Produto p) {
        return null;
    }
    
}
