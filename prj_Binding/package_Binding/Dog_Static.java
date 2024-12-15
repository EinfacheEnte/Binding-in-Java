package package_Binding;

public class Dog_Static extends Animal_Static{      // Erbe von der Klasse Animal_Static

    static String spezies = "Hund";                 // Erstelle eine statische Variable Spezies und setze sie auf "Hund"

    public static void sound(){                     // Erstelle eine statische Methode sound
        System.out.println("Dog*innen ist barkin"); // Ausgabe Dog*innen ist barkin
    }
}