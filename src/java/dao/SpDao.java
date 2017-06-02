/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelo.Sp;

/**
 *
 * @author Laboratorio
 */
public interface SpDao {
    
    public void salvar(Sp s);
    public void alterar(Sp s);
    public void remover(Sp s);
    public List<Sp> listAll();
    public Sp findById(Sp s);
    
}
