/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padaria_do_seu_emilio;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author danpg
 */
public class Main {
    
    public static void main(String[] args) {
        ArrayList <Paozin> Arrpao = new ArrayList <>();
        ArrayList <Frio> Arrfri = new ArrayList <>();
        ArrayList <Doce> Arrdoc = new ArrayList <>();
        ArrayList <Produtos> Arrcmp = new ArrayList <>();
        int option, optionadd,optioncomp = 0,dia;
        String opt[]={"Adicionar", "Comprar", "Sair"};
        String optadd[]={"Pãozinho","Frio","Doce","Voltar"};
        String optcmp[]={"Pãozinho","Frio","Doce","Finalizar Compras","Voltar"};
        do{
            dia = Integer.parseInt(JOptionPane.showInputDialog("Insira o numeral do dia presente:\n1 - Domingo\n2 - Segunda\n3 - Terça\n4 - Quarta\n5 - Quinta\n6 - Sexta\n7 - Sábado"));
            if(dia<0||dia>7){
                JOptionPane.showMessageDialog(null,"Dia inválido");
            }
            if(dia==7){
                JOptionPane.showMessageDialog(null,"Neste dia o Doce há de demorar 20% a mais, e o Pãozinho há de demorar 15% a mais");
            }
            if(dia==1){
                JOptionPane.showMessageDialog(null,"Neste dia o Doce há de demorar 20% a mais, o Pãozinho há de demorar 15% a mais e os Frios hão de demorar 10% a mais");
            }
        }while(dia<0||dia>7);
        JOptionPane.showMessageDialog(null, "PADARIA DO SEU EMÍLIO");
        do{
            option=JOptionPane.showOptionDialog(null, "O que deseja fazer?", null, 0, 0, null, opt, null);
            switch(option){
                case 0:
                    optionadd=JOptionPane.showOptionDialog(null, "O que deseja adicionar então?", null, 0, 0, null, optadd, null);
                    switch(optionadd){
                        case 0:
                            Paozin pao = new Paozin();
                            pao.setEspecificacao(JOptionPane.showInputDialog("Insira a especificação do produto"));
                            pao.setPrice(Double.parseDouble(JOptionPane.showInputDialog("Insira o preço do produto")));
                            pao.setSabor(JOptionPane.showInputDialog("Insira o sabor do produto"));
                            pao.setVal(Integer.parseInt(JOptionPane.showInputDialog("Insira a validade do produto em meses")));
                            pao.setTemtr(2);
                            pao.RegTmp(dia);
                            Arrpao.add(pao);
                            break;
                        case 1:
                            Frio fr = new Frio();
                            fr.setEspecificacao(JOptionPane.showInputDialog("Insira a especificação do produto"));
                            fr.setPrice(Double.parseDouble(JOptionPane.showInputDialog("Insira o preço do produto")));
                            fr.setVal(Integer.parseInt(JOptionPane.showInputDialog("Insira a validade do produto em meses")));
                            fr.setTemtr(6);
                            fr.RegTmp(dia);
                            Arrfri.add(fr);
                            break;
                        case 2:
                            Doce dc = new Doce();
                            dc.setEspecificacao(JOptionPane.showInputDialog("Insira a especificação do produto"));
                            dc.setPrice(Double.parseDouble(JOptionPane.showInputDialog("Insira o preço do produto")));
                            dc.setTipo(JOptionPane.showInputDialog("Insira o tipo do produto"));
                            dc.setVal(Integer.parseInt(JOptionPane.showInputDialog("Insira a validade do produto em meses")));
                            dc.setTemtr(5);
                            dc.RegTmp(dia);
                            Arrdoc.add(dc);
                            break;
                    }
                    break;
                case 1:
                    if(Arrpao.isEmpty()&&Arrdoc.isEmpty()&&Arrfri.isEmpty()){
                        JOptionPane.showMessageDialog(null,"Não há produtos disponíveis no estoque");
                        break;
                    }
                    do{
                        int choicecomp,optcomp;
                        optioncomp=JOptionPane.showOptionDialog(null, "O que deseja comprar?", null, 0, 0, null, optcmp, null);
                        switch(optioncomp){
                            case 0:
                                if(Arrpao.isEmpty()){
                                    JOptionPane.showMessageDialog(null,"Não há produtos disponíveis no estoque");
                                    break;
                                }
                                choicecomp=Integer.parseInt(JOptionPane.showInputDialog("Escolha um item da lista:\nItens disponíveis: "+Arrpao.size()));
                                if(choicecomp>Arrpao.size()||choicecomp<1){
                                    JOptionPane.showMessageDialog(null,"Este produto não existe");
                                }
                                else{
                                    optcomp=JOptionPane.showConfirmDialog(null,"Item "+choicecomp+":\nEspecificação: "+Arrpao.get(choicecomp-1).getEspecificacao()+"\nPreço: "+Arrpao.get(choicecomp-1).getPrice()+"\nValidade: "+Arrpao.get(choicecomp-1).getVal()+" meses\nTempo de entrega: "+Arrpao.get(choicecomp-1).getTemtr()+"\nSabor: "+Arrpao.get(choicecomp-1).getSabor()+"\nDeseja adicionar este item ao carrinho?");
                                    if(optcomp==0){
                                        Arrcmp.add(Arrpao.get(choicecomp-1));
                                    }
                                }
                                break;
                            case 1:
                                if(Arrfri.isEmpty()){
                                    JOptionPane.showMessageDialog(null,"Não há produtos disponíveis no estoque");
                                    break;
                                }
                                choicecomp=Integer.parseInt(JOptionPane.showInputDialog("Escolha um item da lista:\nItens disponíveis: "+Arrfri.size()));
                                if(choicecomp>Arrfri.size()||choicecomp<1){
                                    JOptionPane.showMessageDialog(null,"Este produto não existe");
                                }
                                else{
                                    optcomp=JOptionPane.showConfirmDialog(null,"Item "+choicecomp+":\nEspecificação: "+Arrfri.get(choicecomp-1).getEspecificacao()+"\nPreço: "+Arrfri.get(choicecomp-1).getPrice()+"\nValidade: "+Arrfri.get(choicecomp-1).getVal()+"\nTempo de entrega: "+Arrfri.get(choicecomp-1).getTemtr()+"\nDeseja adicionar este item ao carrinho?");
                                    if(optcomp==0){
                                        Arrcmp.add(Arrfri.get(choicecomp-1));
                                    }
                                }
                                break;
                            case 2:
                                if(Arrdoc.isEmpty()){
                                    JOptionPane.showMessageDialog(null,"Não há produtos disponíveis no estoque");
                                    break;
                                }
                                choicecomp=Integer.parseInt(JOptionPane.showInputDialog("Escolha um item da lista:\nItens disponíveis: "+Arrfri.size()));
                                if(choicecomp>Arrdoc.size()||choicecomp<1){
                                    JOptionPane.showMessageDialog(null,"Este produto não existe");
                                }
                                else{
                                    optcomp=JOptionPane.showConfirmDialog(null,"Item "+choicecomp+":\nEspecificação: "+Arrdoc.get(choicecomp-1).getEspecificacao()+"\nPreço: "+Arrdoc.get(choicecomp-1).getPrice()+"\nValidade: "+Arrdoc.get(choicecomp-1)+"\nTempo de entrega: "+Arrdoc.get(choicecomp-1).getVal()+"\nTipo: "+Arrdoc.get(choicecomp-1)+"\nDeseja adicionar este item ao carrinho?");
                                    if(optcomp==0){
                                        Arrcmp.add(Arrdoc.get(choicecomp-1));
                                    }
                                }
                                break;
                        }
                    }while(optioncomp<3);
                    if(optioncomp==3){
                        if(Arrcmp.isEmpty()){
                                    JOptionPane.showMessageDialog(null,"Não há produtos no carrinho");
                                    continue;
                                }
                        JOptionPane.showMessageDialog(null,"Total de itens: "+Arrcmp.size()+"\nValor total: "+Produtos.valTotal(Arrcmp)+"\nTempo de espera total: "+Produtos.espTotal(Arrcmp)+"");
                    }
                        break;
            }
        }while(option!=2);
    }
}
