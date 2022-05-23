package com.eval1_Q3;

public class Car {

	private String model;
	private String companyName;
	private String color;
	private Engine engine;
	
	public Car() {
		
	}
	
	public Car(String model, String name, String color, int rpm, int power, String manufacture) {
		this.model = model;
		this.companyName = name;
		this.color = color;
		this.engine = new Engine();
		this.engine.setRpm(rpm); 
		this.engine.setPower(power);
		this.engine.setManufacturer(manufacture);
		this.enableEngine(); 
	}
	
	
	public void enableEngine() {
		
		engine.setHasTurbo(true);
	}
	
	public static void main(String[] args) {
		
//		using zero-argument constructor
		Car c1 = new Car();
		c1.model = "Harrier";
		c1.companyName = "Tata";
		c1.color = "black";
		c1.engine = new Engine();
		c1.engine.setRpm(10000);
		c1.engine.setPower(110);
		c1.engine.setManufacturer("tata");
		c1.enableEngine();

		
		System.out.println("Car Model: " + c1.model);
		System.out.println("Car company Name: " + c1.companyName);
		System.out.println("Car color: " + c1.color);
		System.out.println("Car RPM: " + c1.engine.getRpm());
		System.out.println("Car power: " + c1.engine.getPower());
		System.out.println("Car engine manufature: " + c1.engine.getManufacturer());
		System.out.println("Car has Turbo: " + c1.engine.getHasTurbo());
		
		
		System.out.println("===================");
		
//		using parameterised constructor
		
		Car c2 = new Car("Harrier","Tata","black",10000,110,"tata");
		

		System.out.println("Car Model: " + c2.model);
		System.out.println("Car company Name: " + c2.companyName);
		System.out.println("Car color: " + c2.color);
		System.out.println("Car RPM: " + c2.engine.getRpm());
		System.out.println("Car power: " + c2.engine.getPower());
		System.out.println("Car engine manufature: " + c2.engine.getManufacturer());
		System.out.println("Car has Turbo: " + c2.engine.getHasTurbo());
	}
}
