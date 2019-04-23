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
public class Doce extends Produtos {
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public double RegTmp(int diaSem) {
        if(diaSem==7||diaSem==1){
            return this.temtr*1.2;
        }
        return this.temtr;
    }
}
