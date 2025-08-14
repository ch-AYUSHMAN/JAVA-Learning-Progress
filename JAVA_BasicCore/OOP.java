
/* 
    class Dog {
        String breed;
        String name;
        int age;

        void bark(){
            System.out.println("Barks !");
        }

        void eat(){
            System.out.println("Eating..;");
        }
        

    }
    
    public class OOP {
        public static void main(String[] args) {
            Dog a = new Dog();
            a.breed = "local";
            a.name = "dontknow";
            a.age = 3;
            System.out.println("Breed: " + a.breed);
            System.out.println("Name :" + a.name);
            System.out.println("Age :" + a.age);

            a.bark();
            a.eat();
        }
    }*/
    
/*       public static void main ( String[] args){
            Dog dog1 = new Dog();
            dog1.breedName = " Husky";
            dog1.age = 3;
            Dog dog2 = new Dog ();
            dog2.breedName =" Beagle";
            dog2.age = 2;
            System.out.println(dog1.breedName + " is " + dog1.age + " year old.");
            System.out.println(dog2.breedName + " is " + dog2.age + " year old.");
            dog1.bark();
            dog2.eat();
            Dog.showSpecies();

        }
    }
class Dog {
    String breedName;
    int age;


  static String species = "Canine" ;

  void bark(){
    System.out.println( "Dog is Barking");
  }
   void eat(){
    System.out.println( "Dog is Eating");
   }
   static void showSpecies(){
    System.out.println("Species:" + species);
   }

  class Dog {
    String name;
    int age;
    public Dog ( String name , int age){
        this.name= name;
        this.age = age;
        System.out.println("Dog object created with name " + name + " and age " + age);
    }
}
    public class OOP{
    public static void main (String[ ] args){
        Dog dog1 = new Dog ("husky", 2);
        Dog dog2 = new Dog ("Rahul", 3);
        
    }
}

 class Login{
    private String username;
    private String password;
    public String getUsername(){
        return username;
    }
    public void setUsername( String username){
        this.username =username;
    }public String getPassword(){
        return password ;
    }
    public void setPassword (String password) {
        this.password = password;
    }
}
public class OOP {
    public static void main ( String [] args){
        Login login  = new Login();
        login.setUsername("Butterfly");
        login.setPassword("Blue@123");
        System.out.println( "Username: " + login.getUsername());
        System.out.println ("Password: " + login.getPassword());

    }
}
public class OOP {
public static void main (String []  args){
    Polymorphism name = new Polymorphism();
    name.kumar();
    name.kumar(65);
    name.kumar("Goa");


}
}
class Polymorphism{

    public void kumar (){
        System.out.println("Kumar");
    }
    public void kumar(int num){
        System.out.println("kuamr" + (char)num);
    }
    public void kumar ( String str){
        System.out.println ( "kumar" + str);
    }

    
}
class A {
    public void display(){
        System.out.println("Class A");
    }
}
class B extends A {
    @Override
    public void display (){
        System.out.println("Class B");
    }
}

public class OOP {

    public static void main ( String [] args){
        A objA = new A ();
        objA.display();
    
        B objB = new B();
        objB.display();
       A objAB = new B();
        objAB.display();
        
    }
}*/ 

    


    
abstract class proxy {
   abstract void bark();
     abstract void eat();
    void start (){
        bark();
        eat();
    }
}
class Dog extends proxy {
    @Override 
      void bark(){
        System.out.println( "Barking");

    }
    @ Override
       void eat(){
        System.out.println("Eating");
    }

}
public class OOP {
    public static void main( String [] args){
        proxy dog = new Dog ();
        dog.start();

    }
}


     





