import java.util.*;
class Shape{
	public float calculateArea(float length,float width){
		float area=length*width;
		return area;
	}
}
class Circle extends Shape{
	public double circleArea(double radius){
		double area2=3.14*radius;
		return area2;
	}
}
class Rectangle extends Shape{
	public float rectangleArea(float length2,float width2){
		float area3=length2*width2;
		return area3;
	}
}
class Triangle extends Shape{
	public float triangleArea(float base,float heigth){
		float area4=1/2*base*heigth;
		return area4;
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for (int i=1; i<4; i++){
		    System.out.println("Enter length");
		    float length =sc.nextInt();
		    System.out.println("Enter width");
		    float width =sc.nextInt();
		    Shape obj1= new Shape();
		    System.out.println("Shape Area:"+obj1.calculateArea(length,width));
		        
		    System.out.println("Enter Radius");   
            double radius =sc.nextInt();
		    Circle obj2 = new Circle();
		    System.out.println("Circle Area:"+obj2.circleArea(radius));
		        
		    System.out.println("Enter length");   
		    float length2 =sc.nextInt();
		    System.out.println("Enter width");
		    float width2 =sc.nextInt(); 
		    Rectangle obj3=new Rectangle();
		    System.out.println("Rectangle Area:"+obj3.rectangleArea(length2,width2));
		    
	        System.out.println("Enter Base");
	        float base=sc.nextInt();
	        System.out.println("Enter Heigth");
	        float heigth=sc.nextInt();
	        Triangle obj4= new Triangle();
	        System.out.println("Triangle Area:"+obj4.triangleArea(base,heigth));
		}
	}
}