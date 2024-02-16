package guilherme_av;

public class Guilherme_AV {

    public static void main(String[] args) {
        
        ObjetoTridimensional o1, o2;
        EsferaEscalavel o3;
        
        o1 = new Esfera(new Ponto3D(-1, -1, -1), 20);
        o2 = new Paralelepipedo(new Ponto3D(-1,-1,-1), new Ponto3D(1,1,1));
        o3 = new EsferaEscalavel(new Ponto3D(10,10,10), 30);
        
        System.out.println("o1 eh uma Esfera: " +(o1 instanceof Esfera)); //true
        System.out.println("o1 eh um Paralelepipedo: " + (o1 instanceof Paralelepipedo)); //false
        System.out.println("o1 eh um ObjetoTridimencional: " + (o1 instanceof ObjetoTridimensional)); //true
        System.out.println("o2 eh uma Esfera: " + (o2 instanceof Esfera));//false
        System.out.println("o2 eh um Paralelepipedo: " + (o2 instanceof Paralelepipedo));//true
        System.out.println("o2 eh um ObjetoTridimencional: " + (o2 instanceof ObjetoTridimensional));//true
        System.out.println("o3 eh uma Esfera: " + (o3 instanceof Esfera));//true
        System.out.println("o3 eh um ObjetoTridimencional: " + (o3 instanceof ObjetoTridimensional));//true
        System.out.println("o3 eh um Escalavel: " + (o3 instanceof Escalavel));//true
        
        
        System.out.println(o3);
        o3.reduz(0.5);
        System.out.println(o3);
        o3.espelha();
        System.out.println(o3);
        
    }
    
}
