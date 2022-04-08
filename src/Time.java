public class Time {
    private String pais;
    private int quantidadeTitulos;
    private Jogador[] jogador;
    private Partida partida;

    //Método AdicionarJogador


    public Time(String pais, int quantidadeTitulos, Jogador[] jogador, Partida partida) {
        this.pais = pais;
        this.quantidadeTitulos = quantidadeTitulos;
        this.jogador = jogador;
        this.partida = partida;
    }

    public Time(String pais, int quantidadeTitulos) {
        this.pais = pais;
        this.quantidadeTitulos = quantidadeTitulos;
    }

    public Time(){
    }

    public String getPais() {return pais;}

    public void setPais(String pais) {this.pais = pais;}

    public int getQuantidadeTitulos() {return quantidadeTitulos;}

    public void setQuantidadeTitulos(int quantidadeTitulos) {this.quantidadeTitulos = quantidadeTitulos;}

    public Jogador[] getJogador() {return jogador;}

    public void setJogador(Jogador[] jogador) {this.jogador = jogador;}

    public Partida getPartida() {return partida;}

    public void setPartida(Partida partida) {this.partida = partida;}
}
