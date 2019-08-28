
package br.edu.unibratec.psc.jpa;

public class classeTeste {
    
    private String nome;
    private int codigo;
    
    
    public classeTeste(){
        
    }
    
    public boolean numeroPar(int n){
        return n%2 == 0;
    }
    
    public int areaQuadrado(int lado){
        return lado * lado;
    }
    
    public boolean numeroDivisivel(int dividendo, int divisor){
        return dividendo % divisor == 0;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    
    
}
