/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padaria_do_seu_emilio;

import java.util.ArrayList;

/**
 *
 * @author danpg
 */
public abstract class Produtos {
    protected double price;
    protected int val;
    protected String especificacao;
    protected double temtr;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public String getEspecificacao() {
        return especificacao;
    }

    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }

    public double getTemtr() {
        return temtr;
    }

    public void setTemtr(double temtr) {
        this.temtr = temtr;
    }
    
    public static double valTotal(ArrayList <Produtos> product){
        double precototal=0;
        for(Produtos prod: product){
            precototal+=prod.getPrice();
        }
        return precototal;
    }
    
    public static int espTotal(ArrayList <Produtos> product){
        int esptotal=0;
        for(Produtos prod: product){
           esptotal+= prod.getTemtr();
        }
        return esptotal;
    }
    
    public abstract double RegTmp(int diaSem);
}
