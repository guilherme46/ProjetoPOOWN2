/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * autor: Guilherme e Rodrigo
 */
public class Produto_sp {
    
    private int cod_produto;
    private int cod_sp;
    private double preco;

    /**
     * @return the cod_produto
     */
    public int getCod_produto() {
        return cod_produto;
    }

    /**
     * @param cod_produto the cod_produto to set
     */
    public void setCod_produto(int cod_produto) {
        this.cod_produto = cod_produto;
    }

    /**
     * @return the cod_sp
     */
    public int getCod_sp() {
        return cod_sp;
    }

    /**
     * @param cod_sp the cod_sp to set
     */
    public void setCod_sp(int cod_sp) {
        this.cod_sp = cod_sp;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

}