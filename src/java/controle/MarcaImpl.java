/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.MarcaDao;
import dao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Marca;

/**
 *
 * @author Laboratorio
 */
public class MarcaImpl implements MarcaDao{
    Connection conn = ConnectionFactory.getConnection();
    PreparedStatement stmt;
    ResultSet rs;

    @Override
    public void salvar(Marca m) {
    }

    @Override
    public void alterar(Marca m) {
    }

    @Override
    public void remover(Marca m) {
    }

    @Override
    public List<Marca> listAll() {
        List<Marca> list = new ArrayList<>();
        String sql = "SELECT cod_marca, nome FROM marca";
        
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                //popular o objeto
                Marca m = new Marca();
                m.setCod_marca(rs.getInt(1));
                m.setNome(rs.getString(2));
                
                //adiciona na lista
                list.add(m);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MarcaImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public Marca findById(Marca m) {
        return null;
    }
    
}
