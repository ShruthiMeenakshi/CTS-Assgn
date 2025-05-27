package CTSJava;

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Barking");
    }
}

public class AnimalInheritance {
	public static void main(String[] args) {
        Animal newAnimal = new Animal();
        System.out.print("First Animal: ");
        newAnimal.makeSound();

        Dog myDog = new Dog();
        System.out.print("My Dog: ");
        myDog.makeSound();

        Animal secondAnimal = new Dog();
        System.out.print("Second Animal (actual Animal, example Dog): ");
        secondAnimal.makeSound();
    }

}
