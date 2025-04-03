/* UML MOCKUP
class: Exercise11_01 (main)
+ just print the results

class: Triangle -> GeometricObject
+ Triangle()
+ getArea(): double
+ getPerimeter(): double
+ toString(): string

class: GeometricObject: abstract
+ aaaaaaaaaaaaaaaa
*/
import java.util.Scanner;

public class Exercise11_01 {
	public static void main(String[] args) { // main class
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers! "); // asks for sides of triangle
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		System.out.println("What's your favorite color? "); // asks for color
		String color = input.next();
		
		System.out.println("Do you like it everywhere? (Enter True or False) "); // asks true or false question
		boolean filled = input.nextBoolean();
		
		Triangle tri_sides = new Triangle(side1, side2, side3); // Triangle class for determining area and perimeter
		Triangle tri_attr = new Triangle(); // Default class to allow access for the rest of the methods
		
		tri_attr.setColor(color); // see GeometricObject.java
		tri_attr.setFilled(filled); // see GeometricObject.java
		
		System.out.printf("%s Area: %s Perimeter: %s Color: %s Filled: %b", 
			tri_sides.toString(), tri_sides.getArea(), tri_sides.getPerimeter(), tri_attr.getColor(), tri_attr.isFilled()); // outputs the results, i wanna die peacefully and aggressively
	}
}

class Triangle extends GeometricObject { // triangles wow
	double side1 = 1.0; // default sides
	double side2 = 1.0;
	double side3 = 1.0;
	
	public Triangle() {} // no-arg constructor
	
	public Triangle(double side1, double side2, double side3) { // updates sides
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double getArea() {
		double s = (side1 + side2 + side3)/2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}
	
	public String toString() { // outputs all sides
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}
