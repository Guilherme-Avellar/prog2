package guilherme_av;

public class Esfera implements ObjetoTridimensional {
    
    //coloquei protected por conta do uso em outras classes. Poderia ter posto
    //get e set, mas achei que faz mais sentido desta forma
    protected Ponto3D centro;
    protected double raio;

    public Esfera(Ponto3D centro, double raio) {
        this.centro = centro;
        this.raio = raio;
    }
    
    public double getRaio() {
        return raio;
    }
    
    public Ponto3D getCentro() {
        return centro;
    }
    
    public double calcularSuperficie() {
        return 4 * 3.1415 * (raio * raio);
    }
    
    public double calcularVolume() {
        return 4/3 * 3.1415 * (raio * raio * raio);
    }
    
            
}
