// abstract class Animal{           //abstarct=>blueprint
//     abstract void walk();
//     public void eats(){
//         System.out.println("animal eats");
//     }


// }
// class Horse extends Animal {

//     public void walk(){
//         System.out.println("walk on fourlegs");
//     }
// }
// class hens extends Animal{
//     public void walk(){
//         System.out.println("walk on 2 legs  ");
//     }
// }

// public class encapsulation {
//     public static void main(String[] args) {
//         Horse horse=new Horse();
//         horse.walk();
//        //provide an error

//     //    Animal animal=new Animal();
//     //    animal.walk();
//         horse.eats();

//     }
// }



//==>>>>INTERFACES(hide all unneccesary things)

// interface Animal{
//     public void walk();

// }
// class Horse implements Animal{
//     public void walk(){
//         System.out.println("walk on four legs");
//     }
// }


// public class encapsulation {
//     public static void main(String[] args) {
//      Horse horse=new Horse();
//      horse.walk();
//     }
// }

//multiple inheritence

// interface Animal{
//     public void walk();

// }
// interface Hervivorus{
//     public void eats();
// }
// class Horse implements Animal, Hervivorus{
//     public void walk(){
//         System.out.println("walk on four legs");
//     }
//     public void eats(){
// System.out.println("Eat grss ");
//     }
// }


// public class encapsulation {
//     public static void main(String[] args) {
//      Horse horse=new Horse();
//      horse.walk();
//      horse.eats();
//     }
// }

//+> static keyword  (jo class ke liye commen hoti hai)
// directly hum acces kar sakte hai
class Student {
  String name;
  static String school;

    
}



public class encapsulation {
    public static void main(String[] args) {
       Student.school="jmv";
    }
}
