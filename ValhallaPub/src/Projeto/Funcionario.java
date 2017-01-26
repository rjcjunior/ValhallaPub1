/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto;

/**
 *
 * @author Ricardo
 */
public class Funcionario {
    private String nome;
    private String cpf;
    private boolean isgerente = false;
    
    public Funcionario(String nome, String cpf ){
        this.nome = nome;
        this.cpf = cpf;
       
    }
        
    public Funcionario(String nome, String cpf, boolean isgerente ){
        this.nome = nome;
        this.cpf = cpf;
        this.isgerente=isgerente;  
    }
    
    public String getnome(){
        return nome;
    }
    
    public String getcpf(){
        return cpf;
    }
    
    public boolean getgerente(){
        return isgerente;
    }
    public void setgerente(boolean aux){
        this.isgerente = aux;
    }
    public boolean equals(Object funcionario){
             return this.nome.equalsIgnoreCase(((Funcionario)funcionario).getnome());
}
}
