package model;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laboratorio
 */
public class Main {
    public static void main(String[] args) throws IOException{
        try {
            File file = new File("C:/Users/Laboratorio/Documents/produtos.txt");
            Scanner s = new Scanner(file);
            FileReader f = new FileReader(file);
            BufferedReader br = new BufferedReader(f); 
            System.out.println("tem  coisa: ");
            
            String produto = null;
            List<String> list = new ArrayList<String>();
            while((produto = br.readLine())!= null){
                list.add(produto);
            }
            int cont=1;
            for (String p : list) {
                if(p.contains("alt=\"")){
                    String ps = p.substring(p.indexOf("alt=\"")+5,p.indexOf(" title")-1);
                 String vet[] =  ps.split("-");
                    System.out.println(vet[0]+";"+vet[1]);
                }
                    
            }
            
            
            System.out.println("finalizou..");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
