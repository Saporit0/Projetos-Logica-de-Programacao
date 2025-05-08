public class Piloto {

    private int quantidadeHorasVoo;
    private String nomePiloto;

    public Piloto(String nomePiloto) {

        this.nomePiloto = nomePiloto;
        this.quantidadeHorasVoo = 0;

    }

    public void setNomePiloto(String nomePiloto) {

        this.nomePiloto = nomePiloto;
    }

    public String getNomePiloto() {
        return nomePiloto;
    }

    public void adicionarHoras(int horas) {

        this.quantidadeHorasVoo = this.quantidadeHorasVoo + horas;
        System.out.println("Horas do piloto: " + this.quantidadeHorasVoo + "h.");

    }

    public void imprime() {

        System.out.println("Nome do piloto: " + this.nomePiloto + "." +
                "\n Quantidade de horas de voo do piloto: " + this.quantidadeHorasVoo + ".");
        if(this.quantidadeHorasVoo <= 200){

            System.out.println("Tipo do piloto: co-piloto.");
        }else{
            System.out.println("Tipo do piloto: Comandante.");
        }
    }
}
