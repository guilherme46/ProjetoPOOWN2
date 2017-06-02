/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelo.Produto;

/**
 *
 * @author Laboratorio
 */
public interface ProdutoDao {
    
    public void salvar(Produto p);
    public void alterar(Produto p);
    public void remover(Produto p);
    public List<Produto> listAll();
    public Produto findById(Produto p);
    
}
