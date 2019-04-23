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
public class Frio extends Produtos{
    @Override
    public double RegTmp(int diaSem) {
        if(diaSem==1){
            return this.temtr*1.1;
        }
        return this.temtr;
    }
}
