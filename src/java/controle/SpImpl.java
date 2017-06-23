/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.SpDao;
import dao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Sp;

/**
 *
 * @author Laboratorio
 */
public class SpImpl implements SpDao{
    Connection conn = ConnectionFactory.getConnection();
    PreparedStatement stmt;
    ResultSet rs;

    @Override
    public void salvar(Sp s) {
    }

    @Override
    public void alterar(Sp s) {
    }

    @Override
    public void remover(Sp s) {
    }

    @Override
    public List<Sp> listAll() {
        List<Sp> list = new ArrayList<>();
        String sql = "SELECT cod_sp, nome, endereco_cod_endereco FROM sp";
        
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                //popular o objeto
                Sp s = new Sp();
                s.setCod_sp(rs.getInt(1));
                s.setNome(rs.getString(2));
                s.setEndereco_cod_endereco(rs.getInt(3));
              
                
                //adiciona na lista
                list.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SpImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public Sp findById(Sp s) {
        return null;
    }
    
}
