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
public class Produto {
        private int codigo;
        private String nome;
        private double valor;
        private int qnt;
        
        public Produto(String nome, double valor,int qnt) {
                
                this.nome=nome;
                this.valor=valor;
        }
        public int getCodigo() {
            return codigo;
        }
        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }
        
        public int getqnt() {
            return qnt;
        }
        public void setqnt(int qnt) {
            this.qnt = qnt;
        }
        
        public void setnome(String nome) {
            this.nome = nome;
        }
        public String getnome() {
            return this.nome;
        }
        
        public void setValor(double valor) {
            this.valor = valor;
        }
        public double getValor() {
            return this.valor;
        }
            
        public boolean equals(Object produto){
             return this.nome.equalsIgnoreCase(((Produto)produto).getnome());
}
}
