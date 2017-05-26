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
public class Produto {
    
    private int cod_produto;
    private String nome;
    private String cod_barras;
    private double kg;
    private int marca_cod_marca;
    private int cod_cat;

    
    public int getCod_produto() {
        return cod_produto;
    }

    
    public void setCod_produto(int cod_produto) {
        this.cod_produto = cod_produto;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cod_barras
     */
    public String getCod_barras() {
        return cod_barras;
    }

    /**
     * @param cod_barras the cod_barras to set
     */
    public void setCod_barras(String cod_barras) {
        this.cod_barras = cod_barras;
    }

    /**
     * @return the kg
     */
    public double getKg() {
        return kg;
    }

    /**
     * @param kg the kg to set
     */
    public void setKg(double kg) {
        this.kg = kg;
    }

    /**
     * @return the marca_cod_marca
     */
    public int getMarca_cod_marca() {
        return marca_cod_marca;
    }

    /**
     * @param marca_cod_marca the marca_cod_marca to set
     */
    public void setMarca_cod_marca(int marca_cod_marca) {
        this.marca_cod_marca = marca_cod_marca;
    }

    /**
     * @return the cod_cat
     */
    public int getCod_cat() {
        return cod_cat;
    }

    /**
     * @param cod_cat the cod_cat to set
     */
    public void setCod_cat(int cod_cat) {
        this.cod_cat = cod_cat;
    }
    
    
}