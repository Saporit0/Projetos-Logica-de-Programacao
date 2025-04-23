public class Moto extends Veiculo {
    private boolean temPartidaEletrica;

    public Moto(String marca, String modelo, int ano, double combustivel, boolean temPartidaEletrica) {

        super(marca, modelo, ano, combustivel);
        this.temPartidaEletrica = temPartidaEletrica;
    }

    public boolean isTemPartidaEletrica() {
        return temPartidaEletrica;
    }

    public void setTemPartidaEletrica(boolean temPartidaEletrica) {
        this.temPartidaEletrica = temPartidaEletrica;
    }

    public void buzinar() {
        System.out.println("BIBI!");
    }

    public void exibirInfoMoto() {
        super.exibirInfo();
        System.out.println("Tem partida elétrica: " + (this.temPartidaEletrica ? "Sim." : "Não."));
    }
}
