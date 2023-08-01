import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {

        Person ivan = new Person(1, "Ivan", 10_000, "Men");
        Person elena = new Person(2, "Elena", 12_000, "Women");
        Person petr = new Person(3, "Petr", 11_000, "Men");

        ConcurrentHashMap<Integer, Person> map = new ConcurrentHashMap<>();
        map.put(ivan.getId(), ivan);
        map.put(elena.getId(), elena);
        map.put(petr.getId(), petr);

        // System.out.println(map.get(1));


        Thread thread = new Thread(() -> readMap(map));
        thread.start();


    }

    public static void readMap(Map<Integer, Person> map) {
        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println();

        map.put(1, new Person(4, "Olga", 15_000, "Women"));
        map.put(2, new Person(5, "Oleg", 14_000, "Men"));
        map.put(3, new Person(6, "Jon", 9_000, "Men"));
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));
    }
}



