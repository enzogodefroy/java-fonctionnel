package exercices;

import com.sun.jdi.VoidType;

import java.util.ArrayList;
import java.util.function.Function;

public class MaListe {

    private ArrayList<Integer> liste;

    public MaListe(ArrayList<Integer> liste) {
        this.liste = liste;
    }

    public void pourChaque(Consommateur<Integer> consommateur) {
        for (Integer i : this.liste) {
            consommateur.traite(i);
        }
    }

    public static void affiche(Integer i) {
        System.out.println(i);
    }

    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);

        MaListe maListe = new MaListe(l);
        maListe.pourChaque(it -> System.out.println(it));
        maListe.pourChaque(new Consommateur<Integer>() {
            @Override
            public void traite(Integer i) {
                System.out.println(i);
            }
        });

        maListe.pourChaque(System.out::println);

        maListe.pourChaque(MaListe::affiche);
    }
}
