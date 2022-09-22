package exercices;

@FunctionalInterface
public interface Consommateur<T> {

    public void traite(T t);
}
