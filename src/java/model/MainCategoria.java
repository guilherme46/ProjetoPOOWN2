/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controle.ProdutoImpl;
import dao.ProdutoDao;
import java.util.List;
import modelo.Produto;

/**
 *
 * @author Laboratorio
 */


public class MainCategoria {
    
    public static void main(String[] args){

ProdutoImpl proImpl = new ProdutoImpl();
List<Produto> produtos = proImpl.listAll();
           
       for (Produto p: produtos) { 
		
			p.getNome();
			p.getKg();
		
		}
       }
    }
    
   


