package exemplo_polimorfismo_interface;

public class Produto implements Tributavel {
    
    private String nome;
    private double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }
           
    @Override
    public double getValorImposto() {
        
        return this.valor * 0.1;
        
    }

    
    
}
