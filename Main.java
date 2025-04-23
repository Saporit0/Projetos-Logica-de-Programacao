import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao;
        int opcao2;
        Scanner scanner = new Scanner(System.in);
        Sedan sedan = new Sedan(null, null, 0, 0, 0, false);
        Suv suv = new Suv(null, null, 0, 0, 0, 0);
        Moto moto = new Moto(null, null, 0, 0, false);

        do {
            System.out.println("\n Escolha um veículo:");
            System.out.println("1 - Sedan");
            System.out.println("2 - SUV");
            System.out.println("3 - Moto");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite os dados do veículo. " + "\n");
                    System.out.print("Digite o marca do veículo: ");
                    String marca = scanner.nextLine();
                    sedan.setMarca(marca);
                    System.out.print("Digite o modelo do veículo: ");
                    String modelo = scanner.nextLine();
                    sedan.setModelo(modelo);
                    System.out.print("Digite o ano do veículo:");
                    int ano = scanner.nextInt();
                    sedan.setAno(ano);
                    System.out.println("Digite a quantidade de combustível atual do veículo: ");
                    double combustivel = scanner.nextDouble();
                    sedan.setCombustivel(combustivel);
                    System.out.println("Digite quantas portas o veículo possui: ");
                    int numeroPorta = scanner.nextInt();
                    sedan.setNumeroPorta(numeroPorta);
                    System.out.println("O veículo possui teto solar? ");
                    boolean temTetoSolar = scanner.nextBoolean();
                    sedan.setTemTetoSolar(temTetoSolar);

                    do {

                        System.out.println("\nMenu do veículo:");
                        System.out.println("1 - Ligar motor");
                        System.out.println("2 - Desligar motor");
                        System.out.println("3 - Acelerar");
                        System.out.println("4 - Frear");
                        System.out.println("5 - Buzinar");
                        System.out.println("6 - Exibir informações do veículo");
                        System.out.println("0 - Sair");
                        System.out.print("Escolha uma opção: ");
                        opcao2 = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcao2) {
                            case 1:
                                sedan.ligarMotor();
                            case 2:
                                sedan.desligarMotor();
                            case 3:
                                sedan.acelerar();
                            case 4:
                                sedan.frear();
                            case 5:
                                sedan.buzinar();
                            case 6:
                                sedan.exibirInfoSedan();
                            case 0:
                                System.out.println("Saindo.");
                            default:
                                System.out.println("Opção inválida.");
                        }

                    } while (opcao2 != 0);
                case 2:
                    System.out.print("Digite os dados do veículo. " + "\n");
                    System.out.print("Digite o marca do veículo: ");
                    String marca2 = scanner.nextLine();
                    suv.setMarca(marca2);
                    System.out.print("Digite o modelo do veículo: ");
                    String modelo2 = scanner.nextLine();
                    suv.setModelo(modelo2);
                    System.out.print("Digite o ano do veículo:");
                    int ano2 = scanner.nextInt();
                    suv.setAno(ano2);
                    System.out.println("Digite a quantidade de combustível atual do veículo: ");
                    double combustivel2 = scanner.nextDouble();
                    suv.setCombustivel(combustivel2);
                    System.out.println("Digite quantas portas o veículo possui: ");
                    int numeroPorta2 = scanner.nextInt();
                    suv.setNumeroPorta(numeroPorta2);
                    System.out.println("Digite o volume do porta malas: ");
                    double portaMalasVolume = scanner.nextDouble();
                    suv.setPortaMalasVolume(portaMalasVolume);

                    do {

                        System.out.println("\nMenu do veículo:");
                        System.out.println("1 - Ligar motor");
                        System.out.println("2 - Desligar motor");
                        System.out.println("3 - Acelerar");
                        System.out.println("4 - Frear");
                        System.out.println("5 - Buzinar");
                        System.out.println("6 - Exibir informações do veículo");
                        System.out.println("0 - Sair");
                        System.out.print("Escolha uma opção: ");
                        opcao2 = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcao2) {
                            case 1:
                                suv.ligarMotor();
                            case 2:
                                suv.desligarMotor();
                            case 3:
                                suv.acelerar();
                            case 4:
                                suv.frear();
                            case 5:
                                suv.buzinar();
                            case 6:
                                suv.exibirInfoSuv();
                            case 0:
                                System.out.println("Saindo.");
                            default:
                                System.out.println("Opção inválida.");
                        }

                    } while (opcao2 != 0);
                case 3:
                    System.out.print("Digite os dados do veículo. " + "\n");
                    System.out.print("Digite o marca do veículo: ");
                    String marca3 = scanner.nextLine();
                    moto.setMarca(marca3);
                    System.out.print("Digite o modelo do veículo: ");
                    String modelo3 = scanner.nextLine();
                    moto.setModelo(modelo3);
                    System.out.print("Digite o ano do veículo:");
                    int ano3 = scanner.nextInt();
                    moto.setAno(ano3);
                    System.out.println("Digite a quantidade de combustível atual do veículo: ");
                    double combustivel3 = scanner.nextDouble();
                    moto.setCombustivel(combustivel3);
                    System.out.println("O veículo possui partida elétrica? ");
                    boolean temPartidaEletrica = scanner.nextBoolean();
                    moto.setTemPartidaEletrica(temPartidaEletrica);

                    do {

                        System.out.println("\nMenu do veículo:");
                        System.out.println("1 - Ligar motor");
                        System.out.println("2 - Desligar motor");
                        System.out.println("3 - Acelerar");
                        System.out.println("4 - Frear");
                        System.out.println("5 - Buzinar");
                        System.out.println("6 - Exibir informações do veículo");
                        System.out.println("0 - Sair");
                        System.out.print("Escolha uma opção: ");
                        opcao2 = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcao2) {
                            case 1:
                                moto.ligarMotor();
                            case 2:
                                moto.desligarMotor();
                            case 3:
                                moto.acelerar();
                            case 4:
                                moto.frear();
                            case 5:
                                moto.buzinar();
                            case 6:
                                moto.exibirInfoMoto();
                            case 0:
                                System.out.println("Saindo.");
                            default:
                                System.out.println("Opção inválida.");
                        }

                    } while (opcao2 != 0);
                case 0:
                    System.out.println("Saindo.");
                default:
                    System.out.println("Opção Inválida.");
            }
        } while (opcao != 0);
        scanner.close();
    }
}