public class Professor extends Pessoa {

    public Professor(String nome, int idade, double altura, String email, int matricula) {

        super(nome, idade, altura, email, matricula);

    }

    public void exibirInfoProfessor() {
        System.out.print("\n Nome: " + getNome());
        System.out.print("\n Idade: " + getIdade());
        System.out.print("\n Altura: " + getAltura());
        System.out.print("\n Email: " + getEmail());
        System.out.print("\n Matricula: " + getMatricula());
    }
}