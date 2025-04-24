import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao;
        int opcao2;
        Scanner scanner = new Scanner(System.in);
        Sedan sedan = new Sedan(null, null, 0, 0, 0, false);
        Suv suv = new Suv(null, null, 0, 0, 0, 0);
        Moto moto = new Moto(null, null, 0, 0, false);
        Aviao aviao = new Aviao(null, null, 0, 0, 0, true);
        do {
            System.out.println("\n Escolha um veículo:");
            System.out.println("1 - Sedan");
            System.out.println("2 - SUV");
            System.out.println("3 - Moto");
            System.out.println("4 - Avião");
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
                    System.out.print("Digite a quantidade de combustível atual do veículo: ");
                    double combustivel = scanner.nextDouble();
                    sedan.setCombustivel(combustivel);
                    System.out.print("Digite quantas portas o veículo possui: ");
                    int numeroPorta = scanner.nextInt();
                    sedan.setNumeroPorta(numeroPorta);
                    System.out.print("O veículo possui teto solar? ");
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
                                break;
                            case 2:
                                sedan.desligarMotor();
                                break;
                            case 3:
                                sedan.acelerar();
                                break;
                            case 4:
                                sedan.frear();
                                break;
                            case 5:
                                sedan.buzinar();
                                break;
                            case 6:
                                sedan.exibirInfoSedan();
                                break;
                            case 0:
                                System.out.println("Saindo.");
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }
                    } while (opcao2 != 0);
                    break;
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
                    System.out.print("Digite a quantidade de combustível atual do veículo: ");
                    double combustivel2 = scanner.nextDouble();
                    suv.setCombustivel(combustivel2);
                    System.out.print("Digite quantas portas o veículo possui: ");
                    int numeroPorta2 = scanner.nextInt();
                    suv.setNumeroPorta(numeroPorta2);
                    System.out.print("Digite o volume do porta malas: ");
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
                                break;
                            case 2:
                                suv.desligarMotor();
                                break;
                            case 3:
                                suv.acelerar();
                                break;
                            case 4:
                                suv.frear();
                                break;
                            case 5:
                                suv.buzinar();
                                break;
                            case 6:
                                suv.exibirInfoSuv();
                                break;
                            case 0:
                                System.out.println("Saindo.");
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }
                    } while (opcao2 != 0);
                    break;
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
                    System.out.print("Digite a quantidade de combustível atual do veículo: ");
                    double combustivel3 = scanner.nextDouble();
                    moto.setCombustivel(combustivel3);
                    System.out.print("O veículo possui partida elétrica? ");
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
                                break;
                            case 2:
                                moto.desligarMotor();
                                break;
                            case 3:
                                moto.acelerar();
                                break;
                            case 4:
                                moto.frear();
                                break;
                            case 5:
                                moto.buzinar();
                                break;
                            case 6:
                                moto.exibirInfoMoto();
                                break;
                            case 0:
                                System.out.println("Saindo.");
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }
                    } while (opcao2 != 0);
                    break;
                case 4:
                    System.out.print("Digite os dados do veículo. " + "\n");
                    System.out.print("Digite o marca do veículo: ");
                    String marca4 = scanner.nextLine();
                    aviao.setMarca(marca4);
                    System.out.print("Digite o modelo do veículo: ");
                    String modelo4 = scanner.nextLine();
                    aviao.setModelo(modelo4);
                    System.out.print("Digite o ano do veículo:");
                    int ano4 = scanner.nextInt();
                    aviao.setAno(ano4);
                    System.out.print("Digite a quantidade de combustível atual do veículo: ");
                    double combustivel4 = scanner.nextDouble();
                    aviao.setCombustivel(combustivel4);

                    do {

                        System.out.println("\nMenu do veículo:");
                        System.out.println("1 - Ligar motor");
                        System.out.println("2 - Desligar motor");
                        System.out.println("3 - Acelerar");
                        System.out.println("4 - Frear");
                        System.out.println("5 - Decolar");
                        System.out.println("6 - Subir");
                        System.out.println("7 - Descer");
                        System.out.println("8 - Aterrisar");
                        System.out.println("9 - Exibir informações do veículo");
                        System.out.println("0 - Sair");
                        System.out.print("Escolha uma opção: ");
                        opcao2 = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcao2) {
                            case 1:
                                aviao.ligarMotor();
                                break;
                            case 2:
                                aviao.desligarMotor();
                                break;
                            case 3:
                                aviao.acelerar();
                                break;
                            case 4:
                                aviao.frear();
                                break;
                            case 5:
                                aviao.decolar();
                                break;
                            case 6:
                                aviao.subir();
                                break;
                            case 7:
                                aviao.descer();
                                break;
                            case 8:
                                aviao.aterrisar();
                                break;
                            
                            case 9:
                                aviao.exibirInfoAviao();
                                break;
                            case 0:
                                System.out.println("Saindo.");
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }
                    } while (opcao2 != 0);
                case 0:
                    System.out.println("Saindo.");
                    break;
                default:
                    System.out.println("Opção Inválida.");
            }
        } while (opcao != 0);
        scanner.close();
    }
}
