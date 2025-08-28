package JAVA_DSA;
/*  
============================================================
   Example 5.5 - Bounded Wildcards in Java Generics
============================================================

The objective of this example is to illustrate how different
methods can be defined with different bounded wildcard
arguments.

A program is given which consists of the following parts:
1. Definition of all the classes as shown in the figure.
2. Declaration of the generic class, which can be used to store 
   different lists of animals.
3. Definitions of different methods to handle objects of 
   different classes in the class hierarchy.
4. Driver class to manipulate the objects of different types.


--------------------- CLASS HIERARCHY ----------------------

                  ┌──────────────────────────┐
                  │         Animal           │
                  │  - long lifespan         │
                  │  - float weight          │
                  │  + print()               │
                  └───────────▲──────────────┘
                              │
        ┌─────────────────────┴──────────────────────┐
        │                                            │
┌───────────────┐                          ┌────────────────┐
│    Aquatic    │                          │     Land       │
│ - boolean scale│                          │ - short vision │
│ + print()      │                          └───────▲───────┘
└────────────────┘                                  │
                                                   │
                      ┌────────────────────────────┴────────────┐
                      │                                         │
              ┌───────────────┐                       ┌────────────────┐
              │      Pet       │                       │      Wild       │
              │ - String name  │                       │ - float speed   │
              └────────────────┘                       └────────────────┘


------------------------------------------------------------
This hierarchy is used to demonstrate:
- Unbounded wildcards (<?>)
- Upper bounded wildcards (? extends ...)
- Lower bounded wildcards (? super ...)
============================================================
*/




public class BoundedWildcard { 
    public static void main (String args[]){
        // Create a list of unknown animals of class Animal
        Animal unknown = new Animal("Unknown",40, 720);
        Animal u[] = {unknown};
        AnimalWorld <Animal> uList = new AnimalWorld<>(u);
        //Create a list of aquatic animals
        Aquatic whale = new Aquatic("Whale", 90, 150000, false);
        Aquatic shark = new Aquatic("Shark",400, 2150, false);
        Aquatic q [] = { whale , shark};
        AnimalWorld <Aquatic> qList =  new AnimalWorld<Aquatic>( q);
        // Create a list of land animals
        Land owl = new Land("Owl",3, 1, (short) 0);
        Land l  [] = { owl };
        AnimalWorld <Land> lList = new AnimalWorld<Land>(l);
        // Create a list of pet animals
        Pet dog = new Pet("Dog",12, 52, (short) 2, "Tusky");
        Pet p [] = { dog };
        AnimalWorld <Pet> pList = new AnimalWorld<Pet>(p);
        // Create a list of wild animals
        Wild cheetah = new Wild("Cheetah",15, 75, (short)4, 125);
        Wild  deer = new Wild("Deer",10, 48, (short) 1, 86);
        Wild w [] = { cheetah , deer };
        AnimalWorld<Wild> wList = new AnimalWorld<Wild>(w);
        InnerBoundedWildcard.vitality (uList);
        InnerBoundedWildcard.vitality (qList);
        InnerBoundedWildcard.vitality (lList);
        InnerBoundedWildcard.vitality(wList);
        InnerBoundedWildcard.vitality(pList);

        InnerBoundedWildcard.showSea(uList);
        InnerBoundedWildcard.showSea(qList);
       // InnerBoundedWildcard.showSea(lList);
        // InnerBoundedWildcard.showSea(pList);

        //InnerBoundedWildcard.showLand(uList);
        InnerBoundedWildcard.showLand(wList);
        InnerBoundedWildcard.showLand(lList);
        InnerBoundedWildcard.showLand(pList);
        //InnerBoundedWildcard.showLand(qList);
        InnerBoundedWildcard.showPet(pList);
        //InnerBoundedWildcard.showPet(wList);
        InnerBoundedWildcard.showWild(wList);
       // InnerBoundedWildcard.showWild(pList);


    }
}
class Animal {
    String species ;
    long lifespan;
    float weight;
    Animal(String species,long years , float kg){
        this.species= species;
        lifespan = years;
        weight = kg;
    }
    public void print (){
        System.out.println("Animal: " + species);
        System.out.println("Maximum longevity: "+ lifespan + "in years.");
        System.out.println("Maximum weight: "+ weight + "in kgs.");
    }
}
class Aquatic extends Animal {
    boolean scale;
    Aquatic (String species,long years , float kg , boolean skin){
        super(species,years, kg);      //Super class Constructor
        scale = skin;
    }
    public void print(){
        super.print();       // Call the super class method 
        System.out.println("Has Scale ? "+ scale);
    }
}
class Land extends Animal {
    short vision;
    Land (String species,long years , float kg , short vision){
        super(species,years , kg);
        this.vision =  vision;
    }
}
class Pet extends Land {
    String name;
    Pet(String species,long years, float kg, short vision, String name){
        super(species,years, kg, vision);
        this.name= name;
    }
}
class Wild extends Land{
 float speed;
 Wild (String species,long years , float kg, short vision, float speed){
    super(species,years, kg, vision);
    this.speed = speed ;
 }
}
class AnimalWorld <T extends Animal>{
    T [] listOfAnimals;
    AnimalWorld( T [] list){
        listOfAnimals = list;
    }
}
class InnerBoundedWildcard {
    // Case 1 :  Unbound wildcard : Any object can be passed as its argument.
     static void vitality (AnimalWorld <?> animals){
        for (Animal a : animals.listOfAnimals)
        a.print();
        System.out.println ();
    }
    // Case 2: Lower bounded wildcard: Any object of Aquatic or Animal can be passed as its argument.
    static void showSea (AnimalWorld <? super Aquatic > animals){
        for (Object obj : animals.listOfAnimals)
        if (obj instanceof Animal)
        ((Animal)obj).print();
          // Call the method defined in Animal / Aquatic class
        System.out.println();
    }
    // Case 3a: Upper bounded wildcard: Any object of Land/ Pet/ Wild can be passed as its argument.
     static void showLand (AnimalWorld <? extends Land > animals){
        //For Land or any of its subclasses
        for (int i = 0 ; i < animals.listOfAnimals.length ; i++){
            animals.listOfAnimals[i]. print();
             // Call the method defined in Animal class
             System.out.println("Vision: " + animals.listOfAnimals[i].vision);
        }
        System.out.println();
     }
    // Case 3b: Upper bounded wildcard: Any object of only  Pet class can be passed as its argument.
     static void showPet (AnimalWorld <? extends Pet> animals){
        //For lists of Pet objects only
        for( int i = 0 ; i < animals.listOfAnimals.length ; i ++){
            System.out.println("Pet's Name: " + animals.listOfAnimals[i].name);
            animals.listOfAnimals[i].print();
            System.out.println("Vision: " + animals.listOfAnimals[i].vision);
        }
        System.out.println();
     }
     // Case 3c: Upper bounded wildcard: Any object of only  Wild class can be passed as its argument.
     static void showWild(AnimalWorld <? extends Wild> animals){
        for (int i = 0 ; i < animals.listOfAnimals.length ; i++) {
            animals.listOfAnimals[i].print();
            System.out.println("Maximum running speed: " + animals.listOfAnimals[i].speed + "in mph");
            System.out.println("Vision: " + animals.listOfAnimals[i].vision);
        }
        System.out.println();
     }
}
