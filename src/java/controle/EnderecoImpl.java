/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.EnderecoDao;
import dao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Endereco;

/**
 *
 * @author Laboratorio
 */
public class EnderecoImpl implements EnderecoDao{
    Connection conn = ConnectionFactory.getConnection();
    PreparedStatement stmt;
    ResultSet rs;

    @Override
    public void salvar(Endereco e) {
    }

    @Override
    public void alterar(Endereco e) {
    }

    @Override
    public void remover(Endereco e) {
    }

    @Override
    public List<Endereco> listAll() {
        List<Endereco> list = new ArrayList<>();
        String sql = "SELECT cod_endereco, rua, logradouro, cep, bairro, cidade, numero, complemento, estado FROM endereco";
        
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                //popular o objeto
                Endereco e = new Endereco();
                e.setCod_endereco(rs.getInt(1));
                e.setRua(rs.getString(2));
                e.setLogradouro(rs.getString((3)));
                e.setCep(rs.getString((4)));
                e.setBairro(rs.getString((5)));
                e.setCidade(rs.getString((6)));
                e.setNumero(rs.getString((7)));
                e.setComplemento(rs.getString((8)));
                e.setEstado(rs.getString((9)));
                
                //adiciona na lista
                list.add(e);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EnderecoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public Endereco findById(Endereco e) {
        return null;
    }
    
}
