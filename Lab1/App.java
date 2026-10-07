import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        // part1 - array
        int[] x = {3, 8, 2, 9, 4};
        int[] y = {5, 6, 7, 1, 10};
        int[] z = new int[5];
        // find the maximum value of x and y
        for (int i = 0; i < 5; i++) {
            z[i] = Math.max(x[i], y[i]);
        }
        // print arrays x, y, and z
        System.out.print("Array x = { ");

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);

            if (i < x.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println(" }");

        System.out.print("Array y = { ");

        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i]);

            if (i < y.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println(" }");

        System.out.print("Array z = x + y = { ");

        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i]);

            if (i < z.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println(" }");

        // part2 - arraylist
        ArrayList<String> names = new ArrayList<String>();

        names.add("Anne");
        names.add("John");
        names.add("Alex");
        names.add("Jessica");
        names.add("David");

        ArrayList<String> switchedNames = new ArrayList<String>();

        // switch the first and last letters
        for (String name : names){
            char first = name.charAt(0);
            char last = name.charAt(name.length() - 1);
            String middle = name.substring(1, name.length() - 1 );
            String switched = "" + last + middle + first;
            switched = switched.substring(0,1).toUpperCase() + switched.substring(1).toLowerCase();

            switchedNames.add(switched);
        }

            // print the original and switched names
            System.out.print("Names = { ");

            for (int i = 0; i < names.size(); i++){
                System.out.print(names.get(i));

                if (i < names.size() - 1){
                    System.out.print(", ");
                }
            }
            System.out.println(" }");

            System.out.print("Names(switched) = { ");

            for (int i = 0; i < switchedNames.size(); i++){
                System.out.print(switchedNames.get(i));

                if (i < switchedNames.size() - 1){
                    System.out.print(", ");
                }
            }
            System.out.println(" }");

        }
    }