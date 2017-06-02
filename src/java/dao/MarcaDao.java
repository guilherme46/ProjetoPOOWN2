/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelo.Marca;

/**
 *
 * @author Laboratorio
 */
public interface MarcaDao {
    
    public void salvar(Marca m);
    public void alterar(Marca m);
    public void remover(Marca m);
    public List<Marca> listAll();
    public Marca findById(Marca m);
    
}
