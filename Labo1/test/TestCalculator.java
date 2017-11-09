package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Calculator;

class TestCalculator {

	@Test
	void testSetProductionYear() {
		Calculator calc = new Calculator("calculette", 2000);
		calc.setProductionYear(2015);
		if(calc.getAge()!=2) {
			fail("Wrong age");
		}
	}

	@Test
	void testSetCurrentYear() {
		Calculator calc = new Calculator("calculette", 2000);
		calc.setCurrentYear(2015);
		if(calc.getAge()!=15) {
			fail("Wrong age");
		}
	}

	@Test
	void testMultiply() {
		Calculator calc = new Calculator("calculette", 2000);
		int a, b, res;
		a = 5; 
	        b  = 5;
	        res = a * b;
		if (calc.multiply(a, b) != res) {
			fail("a et b positif");
	        }
		a = 0; 
	        b  = 5; 
	        res = a * b;
		if (calc.multiply(a, b) != res) {
			fail("a nul");
	        }
	}

	@Test
	void testDivide() {
		Calculator calc = new Calculator("calculette", 2000);
		int a, b, res;
		a = 5; 
	        b  = 5;
	        res = a / b;
		if (calc.divide(a, b) != res) {
			fail("a et b positif");
	        }
		a = 0; 
	        b  = 5; 
	        res = a / b;
		if (calc.divide(a, b) != res) {
			fail("a nul");
	        }
	}

	@Test
	void testAdd() {
		Calculator calc = new Calculator("calculette", 2000);
		int a, b, res;
		a = 5; 
	        b  = 5;
	        res = a + b;
		if (calc.add(a, b) != res) {
			fail("a et b positif");
	        }
		a = 0; 
	        b  = 5; 
	        res = a + b;
		if (calc.add(a, b) != res) {
			fail("a nul");
	        }
		a = 5; 
	        b  = 0; 
	        res = a + b;
		if (calc.add(a, b) != res) {
			fail("b nul");
	        }
		a = 0; 
	        b  = 0; 
	        res = a + b;
		if (calc.add(a, b) != res) {
			fail("a et b nuls");
	        }
		a = -5; 
	        b  = 5; 
	        res = a + b;
		if (calc.add(a, b) != res) {
			fail("a negatif");
	        }
		a = 5; 
	        b  = -5; 
	        res = a + b;
		if (calc.add(a, b) != res) {
			fail("b negatif");
	        }
		a = -5; 
	        b  = -5; 
	        res = a + b;
		if (calc.add(a, b) != res) {
			fail("a et b negatif");
	        }
	}

	@Test
	void testSubstract() {
		Calculator calc = new Calculator("calculette", 2000);
		int a, b, res;
			a = 5; 
	        b  = 5;
	        res = a - b;
		if (calc.substract(a, b) != res) {
			fail("a et b positif");
	        }
			a = 0; 
	        b  = 5; 
	        res = a - b;
		if (calc.substract(a, b) != res) {
			fail("a nul");
	        }
	}

}
