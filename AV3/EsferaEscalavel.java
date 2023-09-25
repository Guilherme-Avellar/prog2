package guilherme_av;

public class EsferaEscalavel extends Esfera implements Escalavel{

    public EsferaEscalavel(Ponto3D centro, double raio) {
        super(centro, raio);
    }
    
    public void reduz(double valor) {
        raio = raio * valor;
        return;
    }
    
    public void espelha() {
        
         centro.x = - centro.x;
         centro.y = - centro.y;
         centro.z = - centro.z;
    }

    @Override
    public String toString() {
        return "Esfera com centro em (" + centro.x + ", " + centro.y + ", " + centro.z + ") e raio " + raio;
    }
         
}
