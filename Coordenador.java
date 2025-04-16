public class Coordenador extends Pessoa {

    public Coordenador(String nome, int idade, double altura, String email, int matricula) {

        super(nome, idade, altura, email, matricula);

    }

    public void exibirInfoCoordenador() {
        System.out.print("\n Nome: " + getNome());
        System.out.print("\n Idade: " + getIdade());
        System.out.print("\n Altura: " + getAltura());
        System.out.print("\n Email: " + getEmail());
        System.out.print("\n Matricula: " + getMatricula());
    }
}
