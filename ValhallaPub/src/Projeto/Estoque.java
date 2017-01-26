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
public class Estoque {
    private ArrayList<Produto> produtos;
    int cod=0;
        
        public Estoque() {
            produtos = new ArrayList<Produto>();

        }
        public ArrayList<Produto> getprodutos(){
            return produtos;
        }
       
        public void listarEstoque() {
            System.out.println("============ Estoque: ============");
            System.out.println("================================");
            for (Produto p : produtos) {
                System.out.println("Codigo: "+p.getCodigo());
                System.out.println("Nome: "+p.getnome());
                System.out.println(p.getqnt()+" unidades");
                System.out.println("================================");
            }
        }
        
        public void removerProduto(Produto p) {
            produtos.remove(p);
        }
        public boolean contem(Produto p) {
             return produtos.stream().anyMatch((produto) -> (produto.getnome().equalsIgnoreCase(p.getnome())));
        }
        
        public int contem(int cod){
            int i=0;
           
            for (Produto p:produtos){
                if(p.getCodigo()==cod){
                    return i;
                    
                }
                i++;
            }
            return -1;
        }
        
        public void add(Produto p){
          
           if (contem(p)){
               int i=0;
               while (!p.getnome().equalsIgnoreCase(produtos.get(i).getnome())){
                   i+=1;
               }
            int aux= produtos.get(i).getqnt();
            aux += p.getqnt();
            produtos.get(i).setqnt(aux);
            produtos.get(i).setValor(p.getValor());
           }
           
           else{
               
               cod+=1;
               p.setCodigo(cod);
               produtos.add(p);
               
           }
        }
        
        public double consultacod(int cod){  
            boolean aux = false;
            int i = 0;         
             for (Produto produto: produtos){
                if (produto.getCodigo()== cod){ 
                    aux = true;
                    break;
               }
                i+=1;
             }
            if (aux){ 
                return produtos.get(i).getValor();
            }
            else
            {   return -1;
                }
            }
        public double consultanome(String name){
            
            int i = 0;            
            boolean aux = false;                    
             for (Produto produto: produtos){
                if (produto.getnome().equalsIgnoreCase(name)){ 
                    aux = true;
                    break;
               }
                i+=1;
             }
            if (aux){ 
                return produtos.get(i).getValor();
            }
            else
            {   return -1;
                }
            }
        public Produto pegaprod(String nome){
            int i=0;
            for (Produto pe:produtos){
                if(nome.equalsIgnoreCase(pe.getnome())){
                    break;
                }
                else{
                    i+=1;
                }
            }
                return produtos.get(i);
            }          
           }
        