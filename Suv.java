public class Suv extends Carro {
    private double portaMalasVolume;

    public Suv(String marca, String modelo, int ano, double combustivel, int numeroPortas, double portaMalasVolume) {

        super(marca, modelo, ano, combustivel, numeroPortas);
        this.portaMalasVolume = portaMalasVolume;
    }

    public double getPortaMalasVolume() {
        return portaMalasVolume;
    }

    public void setPortaMalasVolume(double portaMalasVolume) {
        this.portaMalasVolume = portaMalasVolume;
    }

    public void exibirInfoSuv(){

        super.exibirInfoCarro();
        System.out.println("Volume do porta malas: " + this.portaMalasVolume + "L");
    }
}
