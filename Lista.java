public class Lista {
    private final int MAX_CLIENTES = 100;
    private Clientes[] cliente;
    private int contador;
    private int proximoId;

    public Lista() {
        cliente = new Clientes[MAX_CLIENTES];
        contador = 0;
        proximoId = 1;
    }

    public void addCliente(String nome, String endereco, String cidade) {
        if (contador >= MAX_CLIENTES) {
            System.out.println("Limite de clientes atingido!");
            return;
        }
        Clientes novoCliente = new Clientes(proximoId, nome, endereco, cidade);
        cliente[contador] = novoCliente;
        contador = contador + 1;
        proximoId = proximoId + 1;
        System.out.println("Cliente adicionado: " + novoCliente);
    }

    public void removerCliente(int id) {
        boolean found = false;
        for (int i = 0; i < contador; i = i + 1) {
            if (cliente[i].getId() == id) {
                found = true;
                for (int j = i; j < contador - 1; j = j + 1) {
                    cliente[j] = cliente[j + 1];
                }
                cliente[contador - 1] = null;
                contador = contador - 1;
                System.out.println("Cliente removido: " + id);
                break;
            }
        }
        if (!found) {
            System.out.println("Cliente não encontrado: " + id);
        }
    }

    public void listaClientes() {
        System.out.println("Lista de Clientes:");
        for (int i = 0; i < contador; i = i + 1) {
            System.out.println(cliente[i]);
        }
    }
}
