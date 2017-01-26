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
public class Controlepedidos {
 private ArrayList<Pedido> pedidos;
 private float vendageral;

      
    public Controlepedidos (){
        pedidos = new ArrayList<Pedido>();    
    }   
    
    public float getvendageral(){
        vendageral=0;
        for (Pedido p:pedidos){
            vendageral+=p.gettotal();
        }
        return this.vendageral;
    }
    
    public void addpedido(Pedido p){
        pedidos.add(p);
    }
    
    public boolean contem(Pedido p1) {
             return pedidos.stream().anyMatch((p) -> (p.getid()==(p1.getid())));
        }      
    
    public boolean contem(int id) {
             return pedidos.stream().anyMatch((p) -> (p.getid()==id));
        }      
    
    
    public Pedido returnpedido(int id){
        int i = 0;
        for (Pedido p:pedidos){
            if (p.getid()==id){
                break;
            }
            else {
                i+=1;
            }
        }
        return pedidos.get(i);
    }
    
    
    
}
