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
    System.out.println("1) Funcionario ");
    System.out.println("2) Produto ");
    System.out.println("3) Consultar lucro ");    
    int op = ler.nextInt();     
     switch (op){
            case 1:{
            }
            
            case 2:{
            }
       
    } 
    }
    
    public void menufuncionario(){
    System.out.println("============ Selecione a opção ============");
    System.out.println("1) Abrir pedido ");
    System.out.println("2) adicionar produto no pedido ");
    System.out.println("3) fechar pedido ");    
    int op = ler.nextInt();    
    }
    
}
