package fr.caensup.cai.si.fonctions;

public class Exo2 {

    public static void main(String[] args) {
        Function<Double, Double> sincos = Function.compose(Math::sin, Math::cos);
        System.out.println("Composition : " + sincos.apply(0.1));

        Function<Integer, Function<Integer, Integer>> maFonction = x -> y -> x+y;

        System.out.println(maFonction.apply(5).apply(6));
    }
}
