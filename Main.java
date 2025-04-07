import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lista listaCliente = new Lista();
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar Cliente");
            System.out.println("2 - Remover Cliente");
            System.out.println("3 - Listar Clientes");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite os dados do cliente. " + "\n");
                    System.out.print("Digite o nome do cliente: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o endereço do cliente: ");
                    String endereco = scanner.nextLine();
                    System.out.print("Digite a cidade do cliente:");
                    String cidade = scanner.nextLine();
                    listaCliente.addCliente(nome, endereco, cidade);

                    break;
                case 2:
                    System.out.print("Digite o id do cliente a remover: ");
                    int removerId = scanner.nextInt();
                    listaCliente.removerCliente(removerId);
                    break;

                case 3:
                    listaCliente.listaClientes();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
