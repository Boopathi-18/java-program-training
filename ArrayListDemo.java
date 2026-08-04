import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        fruits.add(1, "Mango");

        System.out.println(fruits);

        System.out.println(fruits.get(2));

        fruits.set(0, "Avocado");

        fruits.remove("Banana");

        System.out.println(fruits.contains("Cherry"));
    }
}