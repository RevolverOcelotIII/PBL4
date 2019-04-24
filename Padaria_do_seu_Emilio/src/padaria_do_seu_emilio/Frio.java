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
public class Frio extends Produtos{
    
    public static int qtdFri(ArrayList <Produtos> ArrPro){
        int contfri=0;
        for(Produtos frio : ArrPro){
            if(frio instanceof Frio){
                contfri++;
            }
        }
        return contfri;
    }
    
    @Override
    public double RegTmp(int diaSem) {
        if(diaSem==1){
            return this.temtr*1.1;
        }
        return this.temtr;
    }
}
