package guilhermecarneiro_av;

public interface Imposto {
    //para possiveis polimorfismos envolvendo imposto
    //imposto, muito provavelmente, pode ser considerado um contrato
    //Calculos de impostos podem mudar dependendo da situacao
    public double calcularImposto();
    
}
