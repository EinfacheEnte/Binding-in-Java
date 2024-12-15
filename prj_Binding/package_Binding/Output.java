package package_Binding;

public class Output {
    public static void main(String[] args) {

        
/*
   _____ __        __  _           __            ____  _           __                           
  / ___// /_____ _/ /_(_)_________/ /_  ___     / __ )(_)___  ____/ /_  ______  ____ ____  ____ 
  \__ \/ __/ __ `/ __/ / ___/ ___/ __ \/ _ \   / __  / / __ \/ __  / / / / __ \/ __ `/ _ \/ __ \
 ___/ / /_/ /_/ / /_/ (__  ) /__/ / / /  __/  / /_/ / / / / / /_/ / /_/ / / / / /_/ /  __/ / / /
/____/\__/\__,_/\__/_/____/\___/_/ /_/\___/  /_____/_/_/ /_/\__,_/\__,_/_/ /_/\__, /\___/_/ /_/ 
                                                                             /____/             
*/
/*


Statische Bindung bezieht sich auf alles, was zur Kompilierzeit aufgelöst wird.

*/
// Einfache Methoden Bindungen
        Animal_Static animal = new Animal_Static(); // Erstellt ein Objekt der Klasse Animal_Static
        Dog_Static dog = new Dog_Static();          // Erstellt ein Objekt der Klasse Dog_Static
        Animal_Static dog1 = new Dog_Static();      // Erstellt ein Polymorphisches Objekt der Klasse Dog_Static

        animal.sound();                             // Ausgabe: Animal*innen Sounds
        dog.sound();                                // Ausgabe: Dog*innen ist barkin
        dog1.sound();                               // Ausgabe: Animal*innen Sounds

// Statische Variablen Bindungen
        System.out.println(animal.spezies);         // Ausgabe: Normales Tier
        System.out.println(dog.spezies);            // Ausgabe: Hund
        System.out.println(dog1.spezies);           // Ausgabe: Normales Tier
        
/*
    ____                              _           __            ____  _           __                           
   / __ \__  ______  ____ _____ ___  (_)_________/ /_  ___     / __ )(_)___  ____/ /_  ______  ____ ____  ____ 
  / / / / / / / __ \/ __ `/ __ `__ \/ / ___/ ___/ __ \/ _ \   / __  / / __ \/ __  / / / / __ \/ __ `/ _ \/ __ \
 / /_/ / /_/ / / / / /_/ / / / / / / (__  ) /__/ / / /  __/  / /_/ / / / / / /_/ / /_/ / / / / /_/ /  __/ / / /
/_____/\__, /_/ /_/\__,_/_/ /_/ /_/_/____/\___/_/ /_/\___/  /_____/_/_/ /_/\__,_/\__,_/_/ /_/\__, /\___/_/ /_/ 
      /____/                                                                                /____/             
*/


        Person_Dynamic pd = new Person_Dynamic(); // Funktioniert
        Schueler_Dynamic sd = new Schueler_Dynamic(); // Funktioniert
        Person_Dynamic pd1 = new Schueler_Dynamic(); // Funktioniert

        // Schueler_Dynamic sd1 = new Person_Dynamic(); // Funktioniert nicht

        pd.hello(); // Output: Hallo
        sd.hello(); // Output: Yo
        pd1.hello(); // Output: Yo

        // sd1.hello(); // Output: Error
    }
}