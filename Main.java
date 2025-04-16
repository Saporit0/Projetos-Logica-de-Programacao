public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Matheus Saporito", 21, 1.74, "matheussapo@yahoo.com.br", 822158544, 10, 0);
        Aluno aluno2 = new Aluno("Guilherme", 23, 1.83, "guilhermeads91@gmail.com", 822143269, 10, 0);
        Professor professor1 = new Professor("Danilo", 39, 1.80, "danilo.souza@ulife.com.br", 498213748);
        Coordenador coordenador1 = new Coordenador("Edipo", 36, 1.90, "edipo@ulife.com.br", 172917312);
        aluno1.exibirInfoAluno();
        aluno2.exibirInfoAluno();
        professor1.exibirInfoProfessor();
        coordenador1.exibirInfoCoordenador();

    }
}
