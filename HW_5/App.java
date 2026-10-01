import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        String str = "Oakland";
        System.out.println("The length of the string is: " + str.length());

        char result = str.charAt(2);
        System.out.println(result);

        String sub = str.substring(3);
        System.out.println(sub);

        System.out.println(str.toUpperCase());

        int[] abc = {1,3,5,2,5};
        System.out.println("The length of the array is: " + abc.length);
        System.out.println("The last member of the array is: " + abc[4]);

        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Austin");
        cities.add("Houston");
        cities.add("Oakland");
        cities.add("Paris");
        cities.add("San Francisco");
        cities.add("Seattle");
        cities.remove("Paris");
        System.out.println(cities);

    }
}
