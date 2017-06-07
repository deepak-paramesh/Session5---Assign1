import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		Circle c = new Circle(5);
		c.findArea();
		c.findPerimeter();
		
		Triangle t = new Triangle(1,2,3);
		t.findArea();
		t.findPerimeter();
		
		Rectangle r = new Rectangle(1,2);
		r.findArea();
		r.findPerimeter();
		
	}

}

class Circle extends Figure{
	
		int r;
	
	   Circle(int r){
		System.out.println("Enter the Radius : ");
		Scanner sc = new Scanner(System.in);
		  this.r = r = sc.nextInt();
	}
	
	
	void findArea(){
		System.out.println("Area of circle is : ");
		System.out.println(3.142*r*r);
	}
	
	void findPerimeter(){
		
		System.out.println("Perimeter of circle is : ");
		System.out.println(2*3.142*r);
		System.out.println(" ------------------------------");
	}
}

class Triangle extends Figure{
	
	int a;
	int b;
	int h;
	
	Triangle(int a, int b, int h){
		
		System.out.println("Enter the sides of triangle : ");	
		Scanner sc = new Scanner(System.in);
		 this.b = b = sc.nextInt();
		 this.h = h = sc.nextInt();
		 this.a = a = sc.nextInt();
		 //sc.close();
	}
	
void findArea(){
		
		System.out.println("Area of Trinagle is : ");
		System.out.println(0.5*b*h);
					
	}

void findPerimeter(){

	System.out.println("Perimeter of Triangle is : ");
	System.out.println(a+b+h);
	
	System.out.println(" ------------------------------");
}

}

class Rectangle extends Figure{
	
	int length;
	int width;
	Rectangle(int length, int width){
		System.out.println("Enter the sides of Rectangle : ");	
		Scanner sc = new Scanner(System.in);
		
		this.length = length = sc.nextInt();
		this.width = width = sc.nextInt();
	}
	
void findArea(){
		
		System.out.println("Area of Rectangle is : ");
		System.out.println(length*width);
					
	}

void findPerimeter(){

	System.out.println("Perimeter of Rectangle is : ");
	System.out.println(2*(length*width));
	
	System.out.println(" ------------------------------");
}

}
