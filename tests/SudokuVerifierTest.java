import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

//implement tests to test Sudokuverifier with boundary values.  Use templates from Task 1 to derive and document test cases.
	
// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891
String c = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
String i = "123456789912345678891234567789123456678912345567891234456789123345678912234567891";
SudokuVerifier v = new SudokuVerifier();

String notNumber = "41736982563215894795872431682543716979158643234691275828964357157329168416487529e"; // last character e
String incorrect0 = "417369825632158947958724316825437169791586432346912758289643571573291684164875290"; // Last digit 0
String incorrectNumAmount = "4173698256321589479587243168254371697915864323469127582896435715732916841648752910"; // 82 numbers
String incorrectSubgrid = "117369825632158947958724316825437169791586432346912758289643571573291684164875293"; // first digit to 1
String incorrectRow = "617369825432158947958724316825437169791586432346912758289643571573291684164875293"; // Swap first digit and 10th digit
String incorrectColumn = "147369825632158947958724316825437169791586432346912758289643571573291684164875293"; // Swap first digit and 10th digit

	// V2, V3, UNS2, UNR2, UNC2
	@Test
	public void testCorrectString() {
		int a = v.verify(c);
		assertEquals("correct string", a, 0);
	}

	@Test
	public void testIncorrectString() {
		int a = v.verify(i);
		assertEquals("incorrect string", a, -2);
		
	}
	
	// V1
	@Test
	public void testIncorrectValue0() {
		int a = v.verify(incorrect0);
		assertEquals("incorrect string", a, -1);
	}
	
	// V4
	@Test
	public void testIncorrectNumAmount() {
		int a = v.verify(incorrectNumAmount);
		assertEquals("incorrect string", a, -1);
	}
	
	// UNS1
	@Test
	public void testIncorrectSubgrid() {
		int a = v.verify(incorrectSubgrid);
		assertEquals("incorrect string", a, -2);
	}
	
	// UNR1
	@Test
	public void testIncorrectRow() {
		int a = v.verify(incorrectRow);
		assertEquals("incorrect string", a, -3);
	}
	
	// UNC1
	@Test
	public void testIncorrectColumn() {
		int a = v.verify(incorrectColumn);
		assertEquals("incorrect string", a, -4);
	}
	
	// V5
	@Test
	public void testNotANumber() {
		int a = v.verify(notNumber);
		assertEquals("incorrect string", a, 1);
	}
	
	
}
