public class Suv {
    private static double portaMalasVolume;

    public static void main(String[] args) {

        Veiculo ix35 = new Veiculo();

        ix35.setModelo("ix35");
        ix35.setAno(2018);
        ix35.setMarca("Hyundai");
        portaMalasVolume = 728;

        ix35.exibirInfo();
        System.out.print("\n Volume do porta malas: " + portaMalasVolume);
    }
}
