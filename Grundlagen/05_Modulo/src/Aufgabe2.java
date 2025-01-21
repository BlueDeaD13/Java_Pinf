import java.util.ArrayList;

public class Aufgabe2 {
    public static void main(String[] args) {
        ArrayCars(); //Ein Array hat eine feste Größe, die bei der Erstellung angegeben wird.
        ArrayListCars(); //Die Größe einer ArrayList dagegen ist nicht festgelegt, sondern flexibel.
        ArrayZahl();
    }

    public static void ArrayCars() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[0] = "Opel";
        System.out.println(cars[0]);
    }

    public static void ArrayListCars() {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
    }

    public static void ArrayZahl(){
        Float[] zahlen = {9F,6F,1F,3F,5F,7F,8F};
        zahlen[0] = -7.4F;
        System.out.println(zahlen[0]);
    }

}
