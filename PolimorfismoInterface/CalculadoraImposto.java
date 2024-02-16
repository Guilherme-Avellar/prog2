
package exemplo_polimorfismo_interface;

public class CalculadoraImposto {
    
    private static double totalImposto = 0; //somar o valor de todos os impostos juntos

    
    /* 
        Tudo isso foi feito para chegar a este ponto, fazer o polimorfismo com
        a interface tributavel
    */
    public static void calcularImposto(Tributavel item) { 
        totalImposto += item.getValorImposto();
    }
    
    
    //retorna o valor de todos os impostos somados
    public static double getTotalImposto() {
      return totalImposto;
    }

}
