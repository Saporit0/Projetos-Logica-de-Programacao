public class Aviao {
    private int quantidadeHorasAtividadeAviao;

    public Aviao() {

        this.quantidadeHorasAtividadeAviao = 0;
    }

    public void fazVoo(int horas, Piloto piloto) {
        if (this.quantidadeHorasAtividadeAviao < 200) {
            this.quantidadeHorasAtividadeAviao = this.quantidadeHorasAtividadeAviao + horas;
            piloto.adicionarHoras(horas);
            System.out.println("Duração do voo: " + horas);
        } else {
            System.out.println("Avião necessita revisão!");
        }
    }
    public void fazRevisao(){

        this.quantidadeHorasAtividadeAviao = 0;
    }

    public void imprime(){

        System.out.println("Atividade do Avião: " + this.quantidadeHorasAtividadeAviao + "h.");
        if(this.quantidadeHorasAtividadeAviao < 200){

            System.out.println("Status do avião: Apto para voo.");
        }else{
            System.out.println("Status do avião: Revisão necessária.");
        }
    }


}
