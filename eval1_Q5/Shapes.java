package com.eval1_Q5;

public class Shapes {

	public Shapes() {
		Circle c1 = new Circle();
		Square s1 = new Square();
		Rectangle r1 = new Rectangle();
		
		this.area(c1);
		this.area(s1);
		this.area(r1);
	}
	
	public void area(Circle circle) {
		System.out.println("The area of circle is: " + "pi*" + (circle.radius * circle.radius));
	}
	public void area(Rectangle rectangle) {
		System.out.println("The area of rectangle is: " + (rectangle.length * rectangle.breadth) );
	}
	public void area(Square square) {
		System.out.println("The ara of square is: " + (square.side * square.side));
	}
}
