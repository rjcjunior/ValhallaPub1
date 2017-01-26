/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto;

import java.util.ArrayList;

/**
 *
 * @author Ricardo Junior
 */
public class ItensPedido {
     
    private Produto p;
    private int qnt=0;
    private double valortotal;
     
    public ItensPedido(Produto p, int qnt){
        this.p = p;
        this.qnt = qnt;
        this.valortotal=p.getValor()*qnt;  
    }
   
    public int getqnt(){
        return this.qnt;
    }
    public void addqnt(int a){
        if (a<p.getqnt()){
            this.qnt += a;
            this.valortotal= p.getValor()*qnt;
        }
        else{
            System.out.println("qnt acima do disponivel");
            
        }
    }
    public void delqnt(int a){
        
        if (a>=0 && a<=qnt){ 
            this.qnt -= a;
            this.valortotal= p.getValor()*qnt;
    }
        else if (a>=0 && a<=qnt){
    
            this.qnt=0;
            this.valortotal= p.getValor()*qnt;
        }
        else {
            a=a*(-1);
            delqnt(a);
            
        }
    }
    public double gettotal(){
        return valortotal;
       
    }
    public String getnome(){
        return p.getnome();
    }
    
}
