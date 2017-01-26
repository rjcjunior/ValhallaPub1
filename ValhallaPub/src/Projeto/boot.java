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
public class boot {
    private Estoque e;
    private ControleFuncionarios cf;
    public boot(Estoque e, ControleFuncionarios cf){
        this.e=e;
        this.cf=cf;
        add();
    }
    
    public void add(){
        Produto p = new Produto("Arroz", 2.0,2);
        e.add(p);
        Produto p1 = new Produto("Feijao", 2.0,2);
        e.add(p1);
        Produto p2 = new Produto("Biscoito", 2.0,2);
        e.add(p2);
        Produto p3 = new Produto("Cerveja", 2.0,2);
        e.add(p3);
        Produto p4 = new Produto("Catuaba", 2.0,2);
        e.add(p4);
        Produto p5 = new Produto("Macarrao", 2.0,2);
        e.add(p5);
        cf.addgerente("Ricardo", "1234556789");
        cf.addfuncionario("Martin Silva", "13456789021");
    }
}
