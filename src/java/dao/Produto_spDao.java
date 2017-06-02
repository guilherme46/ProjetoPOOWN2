/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelo.Produto_sp;

/**
 *
 * @author Laboratorio
 */
public interface Produto_spDao {
    
    public void salvar(Produto_sp ps);
    public void alterar(Produto_sp ps);
    public void remover(Produto_sp ps);
    public List<Produto_sp> listAll();
    public Produto_sp findById(Produto_sp ps);
    
}
