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
public class Pedido {
    
    private ArrayList<ItensPedido> itenspedido;
    private float total;
    private boolean situacao = false; // Se situacao é false, entao pedido está fechado
    
     public Pedido (){
        itenspedido = new ArrayList<ItensPedido>();     
     }
     
     public void addprod(Produto p, int q){
         if (contem(p)){
         int i=0;
               while (!p.getnome().equalsIgnoreCase(itenspedido.get(i).getnome())){
                   i+=1;
               }
            int aux= itenspedido.get(i).getqnt();
            aux += q;
            itenspedido.get(i).addqnt(aux);
     }
         else{
            ItensPedido aux= new ItensPedido(p,q); 
            itenspedido.add(aux);
         }
         atualizartotal();
     }
     
     private void atualizartotal(){
         total=0;
         for(ItensPedido i:itenspedido){
             total+=i.gettotal();
         }
     }
     public boolean getsitacao(){
        return this.situacao;
     }
     public void setsituacao(boolean aux){
         this.situacao=aux;
     }
         
     public void removerprod(ItensPedido p){
         itenspedido.remove(p);
     }
     
     public float gettotal(){
         return this.total;
     }
     public boolean contem(Produto p) {
             return itenspedido.stream().anyMatch((produto) -> (produto.getnome().equalsIgnoreCase(p.getnome())));
        }
}
