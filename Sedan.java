public class Sedan extends Carro{
    private boolean temTetoSolar;
    
    public Sedan(String marca, String modelo, int ano, double combustivel, int numeroPortas, boolean temTetoSolar){

        super(marca, modelo, ano, combustivel, numeroPortas);
        this.temTetoSolar = temTetoSolar;
    }

    public boolean isTemTetoSolar() {
        return temTetoSolar;
    }

    public void setTemTetoSolar(boolean temTetoSolar) {
        this.temTetoSolar = temTetoSolar;
    }

    public void exibirInfoSedan(){

        super.exibirInfoCarro();
        System.out.println("Tem teto solar: " + (this.temTetoSolar ? "Sim." : "Não."));
    }
}
