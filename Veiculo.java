public class Veiculo {

    private int ano;
    private String marca;
    private String modelo;
    private double velocidadeAtual;
    private double combustivel;
    private boolean motorLigado;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public boolean isMotorLigado() {
        return motorLigado;
    }

    public void setMotorLigado(boolean motorLigado) {
        this.motorLigado = motorLigado;
    }

    public void ligarMotor() {
        if (motorLigado) {
            System.out.println("Motor já está ligado!");
        } else if (combustivel > 0) {
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
        if (velocidadeAtual > 0) {
            if (velocidadeAtual < 0) {
                velocidadeAtual = 0;
            } else {
                this.velocidadeAtual = this.velocidadeAtual - 10;
            }
        } else {
            System.out.println("O carro já está parado.");
        }
    }

    public void exibirInfo() {
        System.out.print("Marca do veículo: " + marca);
        System.out.print("\n Modelo do veículo: " + modelo);
        System.out.print("\n Ano do veículo: " + ano);
        System.out.print("\n Velocidade atual do veículo: " + velocidadeAtual);
        System.out.print("\n Combustivel restante: " + combustivel);
        if (motorLigado) {
            System.out.print("\n Estado do motor: Motor ligado.");
        } else {
            System.out.print("\n Estado do motor: Motor desligado.");
        }
    }
}
