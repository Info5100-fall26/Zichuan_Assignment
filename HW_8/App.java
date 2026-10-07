public class App {
    public static void main(String[] args) {
        String[] array1 = {"Anne", "John", "Alex", "Jessica"};
        String[] array2 = {"Sun", "Mercury", "Venis", "Earth", "Mars", "Jupiter"};

        String[] result1 = inverseArray(array1);
        String[] result2 = inverseArray(array2);

        System.out.println("Original array:");
        for (String word : array1){
            System.out.println("\"" + word + "\"");
        }
        System.out.println("End of the array");

        System.out.println();
        System.out.println("========");
        System.out.println();

        System.out.println("Resultant array:");
        for (String word : result1){
            System.out.println("\"" + word + "\"");
        }
        System.out.println("End of the array");

        System.out.println();
        
        System.out.println("Original array:");
        for (String word : array2){
            System.out.println("\"" + word + "\"");
        }
        System.out.println("End of the array");

        System.out.println();
        System.out.println("========");
        System.out.println();

        System.out.println("Resultant array:");
        for (String word : result2){
            System.out.println("\"" + word + "\"");
        }
        System.out.println("End of the array");
    }


    public static String[] inverseArray(String[] array) {
        String[] result = new String[array.length];
        for (int i = 0; i < array.length; i++){
            String word = array[array.length - 1 - i];
            String reversedWord = "";
            for (int j = word.length()- 1; j >= 0; j--){
                reversedWord = reversedWord + word.charAt(j);
            }

            reversedWord = reversedWord.substring(0 , 1).toUpperCase() + reversedWord.substring(1).toLowerCase();

            result[i] = reversedWord;

        }
        return result;
    }
}
