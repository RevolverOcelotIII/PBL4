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
public class Paozin extends Produtos {
    private String sabor;

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    
    @Override
    public double RegTmp(int diaSem) {
        if(diaSem==7||diaSem==1){
            return this.temtr*1.15;
        }
        return this.temtr;
    }
}
