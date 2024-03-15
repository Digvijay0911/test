import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Alto");
        cars.add("Volvo");
        cars.add("Jeep");
        cars.add("Ciaz");
        System.out.println(cars);
        System.out.println(cars.get(1));

        cars.set(0, "Kia");
        System.out.println(cars);

        cars.remove(1);
        System.out.println(cars);

        System.out.println(cars.size());

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println();
        for(String i:cars){
            System.out.println(i);
        }
    }
}
