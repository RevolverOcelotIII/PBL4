/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padaria_do_seu_emilio;

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

    public void setTentr(double tentr) {
        this.temtr = temtr;
    }
    
    public abstract double RegTmp(int diaSem);
}
