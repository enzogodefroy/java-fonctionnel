package fr.caensup.cai.si.fonctions;

public interface Function<U,V> {

    public V apply(U u);

    static <U,V,T> Function<U,T> compose(Function<V, T> f, Function<U, V> g) {
        return x -> f.apply(g.apply(x));
    };

    static <U,V,T> Function<T,V> andThen(Function<T, U> f, Function<U, V> g) {
        return x -> g.apply(f.apply(x));
    };
}
