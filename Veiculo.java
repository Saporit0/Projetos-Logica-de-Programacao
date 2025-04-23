public class Veiculo {

    private int ano;
    private String marca;
    private String modelo;
    private double velocidadeAtual;
    private double combustivel;
    private boolean motorLigado;

    public Veiculo(String marca, String modelo, int ano, double combustivel) {

        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.combustivel = combustivel;
        this.velocidadeAtual = 0.0;
        this.motorLigado = false;
    }

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
            this.velocidadeAtual = 0;
            this.motorLigado = false;
            System.out.println("Motor desligado.");
        }
    }

    public void acelerar() {
        if (this.motorLigado) {
            if (this.combustivel > 0) {
                this.velocidadeAtual = this.velocidadeAtual + 10;
                this.combustivel = combustivel - 0.5;
                System.out.println("Velocidade atual: " + this.velocidadeAtual + "Km/h");
            } else {
                System.out.println("Não é possivel acelerar sem combustível!");
            }
        } else {
            System.out.println("Ligue o motor primeiro");
        }
    }

    public void frear() {
        if (this.velocidadeAtual > 0) {
            if (this.velocidadeAtual < 0) {
                this.velocidadeAtual = 0;
            } else {
                this.velocidadeAtual = this.velocidadeAtual - 10;
            }
        } else {
            System.out.println("O carro já está parado.");
        }
    }

    public void exibirInfo() {
        System.out.println("Marca do veículo: " + this.marca);
        System.out.println("Modelo do veículo: " + this.modelo);
        System.out.println("Ano do veículo: " + this.ano);
        System.out.println("Velocidade atual do veículo: " + this.velocidadeAtual + "Km/h");
        System.out.println("Combustivel restante: " + this.combustivel + "L");
        System.out.println("Estado do motor: " + (motorLigado ? "Ligado" : "Desligado"));
    }
}
