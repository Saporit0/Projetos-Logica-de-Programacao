public class Veiculo {

    private int ano;
    private String marca;
    private String modelo;
    private double velocidadeAtual;
    private double combustivel;
    private boolean motorLigado;

    public void ligarMotor() {
        if (motorLigado && combustivel > 0) {
            System.out.println("Motor já está ligado!");
        } else {
            this.motorLigado = true;
            System.out.println("Motor ligado.");
        }
    }

    public void desligarMotor() {
        if (!motorLigado) {
            System.out.println("Motor já está desligado!");

        } else {
            this.motorLigado = false;
            System.out.println("Motor desligado.");
        }
    }

    public void acelerar() {
        if (motorLigado) {
            this.velocidadeAtual = this.velocidadeAtual + 10;
        } else {
            System.out.println("Ligue o motor primeiro");
        }
    }

    public void frear() {
        if (velocidadeAtual != 0) {
            this.velocidadeAtual = this.velocidadeAtual - 10;
        } else {
            System.out.println("O carro já está parado.");
        }
    }

    public void exibirInfo() {
        System.out.print("Marca do veículo: " + marca);
        System.out.print("Modelo do veículo: " + modelo);
        System.out.print("Ano do veículo: " + ano);
        System.out.print("Velocidade atual do veículo: " + velocidadeAtual);
        System.out.print("Combustivel restante: " + combustivel);

        System.out.println("Estado do motor: ");
        if (motorLigado) {
            this.ligarMotor();
        } else {
            this.desligarMotor();
        }
    }
}
