import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Time t1 = new Time("Brasil", 2);
        Time t2 = new Time("França", 1);
        Time t3 = new Time("Alemanha", 2);

        List<Time> time = new ArrayList<>();
        time.add(t1);
        time.add(t2);
        time.add(t3);

        Jogador j1 = new Jogador("PK", "Zagueiro",3, t1);
        Jogador j2 = new Jogador("PH", "Goleiro",4, t1);
        Jogador j3 = new Jogador("Aron", "Volante",7, t2);
        Jogador j4 = new Jogador("Lucios", "Atacante",7, t3);

        Partida p1 = new Partida("04/02/2022", "9h", 2 , 1, time);
        Partida p2 = new Partida("04/02/2022", "19h", 0 , 0, time);
        Partida p3 = new Partida("04/02/2022", "19h", 0 , 0, time);

        Estadio e1 = new Estadio("Niltão", "Rio de Janeiro", p1);
        Estadio e2 = new Estadio("Morumbi", "São Paulo", p2);
        Estadio e3 = new Estadio("Zuzão", "São Carlos", p3);

        e1.setPartida(p1);
        e1.setPartida(p3);
        e2.setPartida(p2);

        p1.setPlacarTime1(1);
        p2.setPlacarTime2(3);
        p3.setPlacarTime1(2);

    }
}
