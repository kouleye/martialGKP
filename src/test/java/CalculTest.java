package test.java;

import static org.junit.Assert.*;
import main.java.Calcul;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;



public class CalculTest {

	/**
	 * Test method for {@link com.ucad.cours.Calcul#addition(double, double)}.
	 */
	@Test
	public void testAddition() {
		Calcul calc = new Calcul();
		int a, b, res;
		a = 5;
		b = 5;
		res = a + b;
		assertFalse("a et b positif", calc.addition(a, b) != res);
		a = 0;
		b = 5;
		res = a + b;
		assertFalse("a null", calc.addition(a, b) != res);

		a = 5;
		b = 0;
		res = a + b;
		assertFalse("b null", calc.addition(a, b) != res);
		a = 0;
		b = 0;
		res = a + b;
		assertFalse("a et b nulls", calc.addition(a, b) != res);
		a = -5;
		b = 5;
		res = a + b;
		assertFalse("a negatif", calc.addition(a, b) != res);

		a = 5;
		b = -5;
		res = a + b;
		assertFalse("b negatif", calc.addition(a, b) != res);
		a = -5;
		b = -5;
		res = a + b;
		assertFalse("a et b negatifs", calc.addition(a, b) != res);
	}

	/**
	 * Test method for
	 * {@link com.ucad.cours.Calcul#multiplication(double, double)}.
	 */
	@Test
	public void testMultiplication() {
		Calcul calc = new Calcul();
		int a, b, res;
		a = 5;
		b = 5;
		res = a * b;
		assertFalse("a et b positifs", calc.multiplication(a, b) != res);
		a = 0;
		b = 5;
		res = a * b;
		assertFalse("a null", calc.multiplication(a, b) != res);
		a = 5;
		b = 0;
		res = a * b;
		assertFalse("b null", calc.multiplication(a, b) != res);
		a = 0;
		b = 0;
		res = a * b;
		assertFalse("a et b nuls", calc.multiplication(a, b) != res);
		a = -5;
		b = 5;
		res = a * b;
		assertFalse("a negatif", calc.multiplication(a, b) != res);
		a = 5;
		b = -5;
		res = a * b;
		assertFalse("b negatif", calc.multiplication(a, b) != res);
		a = -5;
		b = -5;
		res = a * b;
		assertFalse("a et b negatifs", calc.multiplication(a, b) != res);
	}

}
