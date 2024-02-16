package exemplo_polimorfismo_interface;

public class Exemplo_polimorfismo_interface {

    public static void main(String[] args) {
        
        Produto produto1 = new Produto("coca-cola", 7.5);
        Servico servico1 = new Servico("servico de internet", 100.00, 15);
        
        CalculadoraImposto.calcularImposto(produto1);
        CalculadoraImposto.calcularImposto(servico1);
        
        
    }
    
}
