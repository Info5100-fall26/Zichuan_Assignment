
class Animals {
    protected String size;
    protected double weight;
    protected String diet;

    public void showInfo() {
        System.out.println("Size: " + size);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Diet: " + diet);
    }
}


class Bird extends Animals {
    String speciesName;
    double wingspan;

    public void showBird() {
        System.out.println("Bird: " + speciesName);
        showInfo();
        System.out.println("Wingspan: " + wingspan + " m");
    }
}


class LandAnimal extends Animals {
    String speciesName;
    int numberOfLegs;

    public void showLandAnimal() {
        System.out.println("Land Animal: " + speciesName);
        showInfo();
        System.out.println("Number of legs: " + numberOfLegs);
    }
}


class Fish extends Animals {
    String speciesName;
    int numberOfFins;

    public void showFish() {
        System.out.println("Fish: " + speciesName);
        showInfo();
        System.out.println("Number of fins: " + numberOfFins);
    }
}

public class Main {
    public static void main(String[] args) {

        // Create a Bird object
        Bird bird = new Bird();
        bird.speciesName = "Eagle";
        bird.size = "Medium";
        bird.weight = 5.0;
        bird.diet = "Predator";
        bird.wingspan = 2.0;

        // Create a LandAnimal object
        LandAnimal land = new LandAnimal();
        land.speciesName = "Elephant";
        land.size = "Large";
        land.weight = 4000.0;
        land.diet = "Vegetarian";
        land.numberOfLegs = 4;

        // Create a Fish object
        Fish fish = new Fish();
        fish.speciesName = "Shark";
        fish.size = "Large";
        fish.weight = 500.0;
        fish.diet = "Predator";
        fish.numberOfFins = 5;

        // Display animal information
        bird.showBird();
        System.out.println();

        land.showLandAnimal();
        System.out.println();

        fish.showFish();
    }
}

    
