/*Create the following class as stated:

A class called circle is designed as shown in the following class diagram. It contains:
• Two private instance variables: radius (of the type double) and color (of the type
String), with default value of 1.0 and "red", respectively.
• Two overloaded constructors - a default constructor with no argument, and a
constructor which takes a double argument for radius.
• Two public methods: getRadius() and getArea(), which return the radius and area of
this instance, respectively.*/

import java.util.Scanner;
//Creating class circle with a radius and color.
class Circle {
    // Declaring radius and color
    private final double radius;
    private final String color;
    
    //Creating Constructors
    //Constructor with no parameter
    public Circle() {
        radius = 1.0;
        color = "red";
    }
    //Constructor with parameter radius
    public Circle(double r) {
        radius = r;
        color = "red";
    }
    //Method for returning radius
    public double getRadius() {
        return radius;
    }
    //Method for returning the area as a instance
    public double getArea() {
        return radius*radius*Math.PI;
    }
}
//Driver class
public class TestCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creating the instance1
        Circle c1 = new Circle();
        System.out.println("The circle has radius of "+ c1.getRadius() + " and area of " + c1.getArea());
        System.out.println("Enter the radius");
        double r1= sc.nextDouble();
        //Creating the instance2
        Circle c2 = new Circle(r1);
        System.out.println("The circle has radius of "+ c2.getRadius() + " and area of " + c2.getArea());
    }
}
