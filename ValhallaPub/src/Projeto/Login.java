/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto;

/**
 *
 * @author Ricardo Junior
 */
public class Login {
    private ValhallaPub vp;
    public Login(ValhallaPub vp){
        this.vp=vp;
    }
    
    public boolean logar(String cpf){
        if (vp.consultacpfgerente(cpf)){
            return true;
        }
        return false;
    }
}

