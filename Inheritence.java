// example of inheritence

// class Shape {
// String colour;
// }
// class Triangle extends Shape { //we use extands keyword
// }
// public class Inheritence {

// public static void main(String[] args) {

// Triangle t1=new Triangle();
// t1.colour="green";
// }
// }


//Type of inheritence
//=> Single level inheritence
//Base Class=>Drived Class
// class Shape {
//    public void area(){
// System.out.println("print area");
//    }
// }
// class Triangle extends Shape { 
// public void TriangleArea(int l,int h){
// System.out.println(0.5*l*h);
// }
// }
// public class Inheritence {

// public static void main(String[] args) {
// Triangle t1=new Triangle();

// t1.area();
// t1.TriangleArea(4, 3);
// }
// }


//multilevel inheritence  
//Base class=>Derived class=>Derived class

// class Shape {
//    public void area(){
// System.out.println("print area");
//    }
// }
// class Triangle extends Shape { 
// public void TriangleArea(int l,int h){
// System.out.println(0.5*l*h);
// }
// }
// class Equi extends Triangle {
//     public void area(int l,int h) {
//         System.out.println(1/2*h*l);
//     }

    
// }
// public class Inheritence {

// public static void main(String[] args) {
// Triangle t1=new Triangle();
// Equi t2=new Equi();

// t1.area();
// t1.TriangleArea(4, 3);
// t2.area(1, 4);
// }
// }

// Hiraricial inheritence
//         baseclass
//         /      \
// drived class  drived class
class Shape {
   public void area(){
System.out.println("print area");
   }
}
class Triangle extends Shape { 
public void TriangleArea(int l,int h){
System.out.println(0.5*l*h);
}
}
class Rec extends Shape {
    public void area(int l,int b) {
        System.out.println(b*l);
    }

    
}
public class Inheritence {

public static void main(String[] args) {
Triangle t1=new Triangle();
Rec r=new Rec();


t1.area();
t1.TriangleArea(4, 3);
r.area(1, 4);
}
}