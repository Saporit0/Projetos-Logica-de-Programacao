public class Carro extends Veiculo {
    private int numeroPorta;

    public Carro(String marca, String modelo, int ano, double combustivel, int numeroPorta) {

        super(marca, modelo, ano, combustivel);
        this.numeroPorta = numeroPorta;
    }

    public int getNumeroPorta() {
        return numeroPorta;
    }

    public void setNumeroPorta(int numeroPorta) {
        this.numeroPorta = numeroPorta;
    }

    public void buzinar(){

        System.out.println("FON!");
    }

    public void exibirInfoCarro(){

        super.exibirInfo();
        System.out.println("Número de portas: " + this.numeroPorta);
    }

}
