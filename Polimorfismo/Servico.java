package exemplo_polimorfismo_interface;

public class Servico implements Tributavel {

    private String descricao;
    private double valor;
    private double aliquotaISS;

    public Servico(String descricao, double valor, double aliquotaISS) {
        this.descricao = descricao;
        this.valor = valor;
        this.aliquotaISS = aliquotaISS;
    }
    
    
    @Override
    public double getValorImposto() { //pode haver diferentes valores de impostos
        return this.valor * this.aliquotaISS / 100;
    }
    
    

    //getters e setters
}
