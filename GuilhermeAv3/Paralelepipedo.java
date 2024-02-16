package guilherme_av;


public class Paralelepipedo implements ObjetoTridimensional{
    
    private Ponto3D p1;
    private Ponto3D p2;

    public Paralelepipedo(Ponto3D p1, Ponto3D p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public Ponto3D getCentro() {
        
        // para achar o centro fiz essas variaveis.
        // pensei em tirar o modulo, mas pode haver
        // um centro com valor negativo '-' se o 
        //retangulo estiver no quinto octante, por exemplo
        double auxX, auxY, auxZ;
        
        if(p1.x < p2.x) {
            auxX = p2.x - p1.x;
        } else {
            auxX = p1.x - p2.x;
        }
        if(p1.y < p2.y) {
            auxY = p2.y - p1.y;
        } else {
            auxY = p1.y - p2.y;
        }
        if(p1.z < p2.z) {
            auxZ = p2.z - p1.z;
        } else {
            auxZ = p1.z - p2.z;
        }
        
        Ponto3D p = new Ponto3D(auxX, auxY, auxZ);
        
        return p;    
    }
    
    public double calcularSuperficie() {
        
        double tamX, tamY, tamZ; //tamanho dos eixos
        
        tamX = Math.abs(p1.x - p2.x);
        tamY = Math.abs(p1.y - p2.y);
        tamZ = Math.abs(p1.z - p2.z);
        
        return 2 * (tamX * tamZ) + 2 * (tamY * tamZ) + 2 * (tamX * tamY);
        
    }
    
    public double calcularVolume() {
        
        double tamX, tamY, tamZ; //tamanho dos eixos
        
        tamX = Math.abs(p1.x - p2.x);
        tamY = Math.abs(p1.y - p2.y);
        tamZ = Math.abs(p1.z - p2.z);
        
        return (tamX * tamZ) * (tamY * tamZ) * (tamX * tamY);
    }
    
}
