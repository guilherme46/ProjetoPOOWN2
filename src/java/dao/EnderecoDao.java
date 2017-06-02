/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelo.Endereco;

/**
 *
 * @author Laboratorio
 */
public interface EnderecoDao {
    
    public void salvar(Endereco e);
    public void alterar(Endereco e);
    public void remover(Endereco e);
    public List<Endereco> listAll();
    public Endereco findById(Endereco e);
    
}
