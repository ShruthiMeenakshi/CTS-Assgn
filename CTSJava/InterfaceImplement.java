package CTSJava;

interface Playable {
    void play();
}

class Guitar implements Playable {
    
    public void play() {
        System.out.println("\nThe Guitar strums a melodic tune.");
    }
}

class Piano implements Playable {

    public void play() {
        System.out.println("The Piano is playing a harmonious chord.");
    }
}

public class InterfaceImplement {
	public static void main(String[] args) {
        Guitar myGuitar = new Guitar();
        Piano myPiano = new Piano();

        System.out.println("--Let's hear music with Piano and Guitar!--");
        myGuitar.play();
        myPiano.play();

        System.out.println("\n--Demonstrating Polymorphism--");
        Playable instrument1 = new Guitar();
        Playable instrument2 = new Piano();

        instrument1.play();
        instrument2.play();
    }
}
