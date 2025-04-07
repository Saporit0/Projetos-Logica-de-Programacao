public class Clientes {

    private int id;
    private String nome;
    private String endereco;
    private String cidade;

    public Clientes(int id, String nome, String endereco, String cidade) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }

    @Override
    public String toString() {
        return "Tarefa    : " + "id=" + id + "\n" +
                "Nome     : " + nome + "\n" +
                "Endereço : " + endereco + "\n" +
                "Cidade   : " + cidade;
    }
}