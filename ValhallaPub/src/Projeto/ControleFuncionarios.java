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
public class ControleFuncionarios {
    private ArrayList<Funcionario> funcionarios;
    
    public ControleFuncionarios (){
        funcionarios = new ArrayList<Funcionario>();    
    }
    
     public void addfuncionario(String nome,String cpf){
          
           if (contem(cpf)){

               System.out.println("Funcionario ja cadastrado");
           }
           else{
               Funcionario aux = new Funcionario(nome,cpf);
               funcionarios.add(aux);
           }
        }
        
    
    public void addgerente(String nome, String cpf){
         if (contem(cpf)){

               System.out.println("Funcionario ja cadastrado");
        }
         else{ 
            Funcionario  f = new Funcionario(nome, cpf);
            f.setgerente(true);
            funcionarios.add(f);
   
         }
    }
    public void listarfunc() {
            System.out.println("============ Funcionario ============");
            System.out.println("================================");
            for (Funcionario f : funcionarios) {
                System.out.println("Nome: "+f.getnome());
                if (f.getgerente()) System.out.println("Gerente");
                else System.out.println("Caixa");
                System.out.println("================================");
            }
        } 
    
    public boolean contem(Funcionario p) {
             return funcionarios.stream().anyMatch((funcionario) -> (funcionario.getnome().equalsIgnoreCase(p.getnome())));
        }      
    public boolean contem(String p) {
             return funcionarios.stream().anyMatch((funcionario) -> (funcionario.getcpf().equalsIgnoreCase(p)));
        }      
    
    public String consultacpf(String cpf){
        if( contem(cpf)){
            for (Funcionario f:funcionarios){
                if(f.getcpf().equalsIgnoreCase(cpf)){
                    return f.getnome();
                }
            }
        }        
        return("CPF INVALIDO");        
    }
    
    
    public boolean consultacpfgerente(String cpf){
        if( contem(cpf)){
            for (Funcionario f:funcionarios){
                if(f.getcpf().equalsIgnoreCase(cpf)){
                    if(f.getgerente()){
                        return true;
                        
                }
                    else{
                        return false;
                    }
            }
        }
        }
        return false;        
        
        
    }
    
}
