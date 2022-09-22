import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(12,54,44,45,51);
        stream.map(it -> it*2).forEach(it -> System.out.println(it));

        System.out.println("-----------------");

        Stream<Integer> stream2 = Stream.of(12,54,44,45,51);
        stream2.parallel().map(it -> it*2).forEach(it -> System.out.println(it));
    }
}