package projeto2;




public class Cliente {
    private String nome;
    private int idade;
    private double saldo = 100.0;
    private static int idadeMinima = 18;
    private Veiculo v = null;
    
    private Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public void alugarVeiculo(Veiculo v){
        if(saldo > 0.0 && v.isDisponivel() && this.v == null){
            this.v = v;
            v.setDisponivel(false);
            v.setCliente(this);
        }
    }
    
    public void devolverVeiculo(int novoKm){
        if(this.v != null){
            double preco = (novoKm - this.v.getKm())*this.v.getTaxaAluguel();
            System.out.println("O valor do aluguel eh: "+preco);
            this.saldo -= preco;
            if(saldo<0.0) System.out.println("Seu saldo está negativo. Você não pode alugar mais veı́culos!");
            this.v.setKm(novoKm);
            this.v.setCliente(null);
            this.v.setDisponivel(true);
            this.v = null;
        }
    }
    
    public void adicionarCredito(double valor){
        if(valor > 0.0) this.saldo += valor;
        else System.out.println("Operacao Invalida.");
    }
    
    public static Cliente construirCliente(String nome, int idade){
        if(idade >= idadeMinima) return new Cliente(nome, idade);
        else{
            System.out.println("Cliente não cadastrado");
            return null;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade >= idadeMinima) this.idade = idade;
        else{
            System.out.println("Operacao Invalida");
        }
    }

    public static void setIdadeMinima(int idadeMinima) {
        Cliente.idadeMinima = idadeMinima;
    } 
    
    
    
    
}
