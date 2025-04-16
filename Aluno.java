public class Aluno extends Pessoa {

    private int ra;
    private double nota;

    public Aluno(String nome, int idade, double altura, String email, int ra, double nota, int matricula) {

        super(nome, idade, altura, email, matricula);

        this.ra = ra;
        this.nota = nota;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void exibirInfoAluno() {
        System.out.print("\n Nome: " + getNome());
        System.out.print("\n Idade: " + getIdade());
        System.out.print("\n Altura: " + getAltura());
        System.out.print("\n Email: " + getEmail());
        System.out.print("\n RA: " + ra);
        System.out.print("\n Nota: " + nota);

    }
}
