public class Estadio {
    private String nome;
    private String cidade;
    private Partida partida;
    private Time time;

    public Estadio(String nome, String cidade, Partida partida) {
        this.nome = nome;
        this.cidade = cidade;
        this.partida = partida;
    }

    public Estadio(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public Estadio() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }
}
