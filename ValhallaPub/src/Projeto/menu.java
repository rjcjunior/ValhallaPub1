/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto;

import java.util.Scanner;

/**
 *
 * @author Ricardo Junior
 */
public class menu {
    Scanner ler = new Scanner(System.in);
    ControleFuncionarios cf;
    Controlepedidos cp;
    Estoque e;
    int id=0;
    public menu(){
        cf = new ControleFuncionarios();
        e = new Estoque();
        cp = new Controlepedidos();
    }
    
    public void chamamenu(){
    System.out.println("============ Bem vindo ============");
    System.out.println("============ Selecione a opção ============");
    System.out.println("1) Funcionario ");
    System.out.println("2) Gerente ");
    int op = ler.nextInt();     
     switch (op){
            case 1:{
                menufuncionario();
                break;
            }
            
            case 2:{
                menugerente();
                break;
            }
       
    } 
    }
    
    public void menugerente(){
    System.out.println("============ Selecione a opção ============");
    System.out.println("1) Gerenciar Funcionarios ");
    System.out.println("2) Gerenciar Produtos ");
    System.out.println("3) Consultar total de vendas ");    
    System.out.println("4) Voltar ");    
    
    int op = ler.nextInt();     
     switch (op){
            case 1:{
                gerenciafuncionarios();
                break;
            }
            
            case 2:{
                gerenciarprodutos();
                break;
            }
            
            case 3:{
                System.out.println("Venda total de R$ ");
                System.out.println(cp.getvendageral());   
                break;
                
            }
            
            case 4:{
                chamamenu();
                break;
            }
       
    } 
    }
    
    public void gerenciafuncionarios(){
    System.out.println("============ Selecione a opção ============");
    System.out.println("1) Adicionar Funcionario ");
    System.out.println("2) Adicionar Gerente "); 
    System.out.println("3) Listar Funcionarios ");
    System.out.println("4) Remover Funcionario ");    
    System.out.println("5) Voltar ");     
    int op = ler.nextInt();     
     switch (op){
            case 1:{
                System.out.println("Entre com o nome ");    
                String name = ler.next();
                System.out.println("Entre com o cpf ");    
                String cpf = ler.next();
                cf.addfuncionario(name, cpf);
                gerenciafuncionarios();
                break;
            }
            
            case 2:{
                System.out.println("Entre com o nome ");    
                String name = ler.next();
                System.out.println("Entre com o cpf ");    
                String cpf = ler.next();
                cf.addgerente(name, cpf);
                gerenciafuncionarios();
                break;
            }
            case 3:{
                cf.listarfunc();
                gerenciafuncionarios();
                break;
            }
            
            case 4:{
                System.out.println("Entre com o cpf ");    
                String cpf = ler.next();
                cf.removerfunc(cpf);
                gerenciafuncionarios();
                break;
            }
            
            case 5:{
                menugerente();
                gerenciafuncionarios();
                break;
            }
             
            
       
    } 
    }
    
    public void gerenciarprodutos(){
    System.out.println("============ Selecione a opção ============");
    System.out.println("1) Adicionar produtos ");
    System.out.println("2) Atualizar produtos ");
    System.out.println("3) Remover produtos ");
    System.out.println("4) Listar produtos ");
    System.out.println("5) Voltar ");    

    int op = ler.nextInt();     
     switch (op){
            case 1:{
                System.out.println("Entre com o nome ");    
                String name = ler.next();
                System.out.println("Entre com o valor ");    
                double preco = ler.nextDouble();
                System.out.println("Entre com a qtd ");    
                int qnt = ler.nextInt();
                Produto p = new Produto(name, preco, qnt);
                e.add(p);
                gerenciarprodutos();
                break;
            }
            case 2:{
                System.out.println("Entre com o nome ");    
                String name = ler.next();
                System.out.println("Entre com o valor ");    
                double preco = ler.nextDouble();
                System.out.println("Entre com a qtd a acrescentar");    
                int qnt = ler.nextInt();
                Produto p = new Produto(name, preco, qnt);
                e.add(p);
                gerenciarprodutos();
                break;
            }
            case 3:{
                //mexer
                gerenciarprodutos();
                break;
            }
            case 4:{
                e.listarEstoque();
                gerenciarprodutos();
                break;
            }
            case 5:{
                menugerente();
                break;
            }
    } 
    }
    
    
    public void menufuncionario(){
    System.out.println("============ Selecione a opção ============");
    System.out.println("1) Abrir pedido ");
    System.out.println("2) adicionar produto no pedido ");
    System.out.println("3) fechar pedido ");    
    System.out.println("4) Voltar ");    
    int op = ler.nextInt();    
    switch (op){
            case 1:{
                id+=1;
                Pedido pe = new Pedido(id);
                System.out.println("Id do pedido é ");
                System.out.println(id);
                cp.addpedido(pe);
                menufuncionario();    
                break;
            }
            case 2:{
                System.out.println("Entre com o id do pedido");
                int aux = ler.nextInt();
                Pedido pe;
                pe=cp.returnpedido(aux);
                System.out.println("Entre com o nome do produto");
                String aux2 = ler.next();
                
                
                System.out.println("Entre com a qt do pedido");
                int aux4 = ler.nextInt();
                pe.addprod(aux2, aux4);
                menufuncionario();
                break;
            }
            case 3:{
                menufuncionario();    
                break;
            }
            case 4:{
                menufuncionario();    
                break;
            }
            
    }
    }
    
}
