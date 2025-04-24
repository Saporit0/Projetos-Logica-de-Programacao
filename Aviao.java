public class Aviao extends Veiculo {
    private double altitude;
    private boolean tremDePousoBaixado;

    public Aviao(String marca, String modelo, int ano, double combustivel, double altitude,
            boolean tremDePousoBaixado) {

        super(marca, modelo, ano, combustivel);
        this.altitude = altitude;
        this.tremDePousoBaixado = tremDePousoBaixado;

    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public boolean isTremDePousoBaixado() {
        return tremDePousoBaixado;
    }

    public void setTremDePousoBaixado(boolean tremDePousoBaixado) {
        this.tremDePousoBaixado = tremDePousoBaixado;
    }

    public void decolar() {

        if (this.altitude > 0) {

            System.out.println("Não é possível decolar se o avião ja está voando!");

        } else {
            this.altitude = this.altitude + 1000;
            this.tremDePousoBaixado = false;
            this.altitude = this.altitude + 9000;
            System.out.println("Decolando...");
            System.out.println("Altitude atual: " + this.altitude + "m");
        }
    }

    public void subir() {

        if (this.altitude > 0) {
            this.altitude = this.altitude + 1000;
            System.out.println("Altitude atual: " + this.altitude + "m");
        } else {
            System.out.println("O avião está no chão!");
        }

    }

    public void descer() {

        if (this.altitude > 0) {
            if (this.altitude <= 1000) {
                System.out.println("Altitude ideal para aterrisar.");

            } else {
                this.altitude = this.altitude - 1000;
                System.out.println("Altitude atual: " + this.altitude + "m");
            }
        } else {
            System.out.println("O avião está no chão!");
        }
    }

    public void aterrisar() {

        if (this.altitude > 0) {
            while (this.altitude > 0) {
                if (altitude <= 900) {
                    if (this.tremDePousoBaixado == false) {
                        this.tremDePousoBaixado = true;
                        System.out.println("Baixando trem de pouso.");
                    }
                }
                this.altitude = this.altitude - 100;
                System.out.println("Altitude atual: " + this.altitude + "m");
                if(this.altitude == 0){
                    System.out.println("Avião pousado com sucesso!");
                }
            }
        } else {
            System.out.println("O avião está no chão!");
        }
    }

    public void exibirInfoAviao() {

        super.exibirInfo();
        System.out.println("Altitude atual do avião: " + this.altitude + "m");
        System.out.println("Trem de pouso: " + (this.tremDePousoBaixado ? "Baixado" : "Guardado"));
    }
}
