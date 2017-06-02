/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controle.CategoriaImpl;
import dao.CategoriaDao;
import java.util.List;
import modelo.Categoria;

/**
 *
 * @author Laboratorio
 */
public class MainCategoria {
    
    public static void main(String[] args){
        CategoriaImpl categoriaImpl = new CategoriaImpl();
        
        List<Categoria> list = categoriaImpl.listAll();
        for (Categoria categoria : list) {
            System.out.println(categoria.getCod_cat()+" - "+categoria.getNome());
        }
    }
    
}
