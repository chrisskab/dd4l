package main;

public class Calculator {
	
	//Attributs de la classe
	private String name;
	private int productionYear;
	private int currentYear;
	private int age;
	
	//Constructor
	public Calculator(String name, int productionYear) {
		name = name;
		productionYear = productionYear;
		currentYear=2017;
		age=currentYear-productionYear;
	}

	//Getters
	public String getName() {
		return name;
	}
	
	public int getProductionYear() {
		return productionYear;
	}
		
	public int getCurrentYear() {
		return currentYear;
	}
	
	public int getAge() {
		return age;
	}

	//Setters
	public void setName(String name) {
		name = name;
	}
	
	public void setProductionYear(int productionYear) {
		productionYear = productionYear;
		age = currentYear - productionYear;
	}
	
	public void setCurrentYear(int currentYear) {
		currentYear = currentYear;
		age = currentYear - productionYear;
	}
	
	public void setAge(int age) {
		age=age;
		productionYear= currentYear - age;
	}
	//Méthodes de la calculatrice
	
	public int multiply(int a, int b) {
		return (a*b);
	}
	public int divide(int a, int b) {
		return (a/b);
	}
	public int add(int a, int b) {
		return (a+b);
	}
	public int substract(int a, int b) {
		return (a-b);
	}
	
}


