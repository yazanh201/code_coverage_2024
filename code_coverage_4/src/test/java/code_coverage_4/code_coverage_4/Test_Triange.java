package code_coverage_4.code_coverage_4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test_Triange {
	
	TriangleClassification tester= new TriangleClassification();
	
	
	
	@Test
	public void T_C1(){
		String expected = "EQUILATERAL";
		int a = 6, b = 6, c = 6;
		String actual=tester.classifyTriangle(a, b, c);
		assertEquals(expected,actual);
	}
	
	@Test
	public void T_C2(){
		String expected = "ISOSCELES";
		int a = 6, b = 6, c = 4;
		String actual=tester.classifyTriangle(a, b, c);
		assertEquals(expected,actual);
	}
	
	
	@Test
	public void T_C3(){
		String expected = "ISOSCELES";
		int a = 6, b = 4, c = 6;
		String actual=tester.classifyTriangle(a, b, c);
		assertEquals(expected,actual);
	}
	
	
	@Test
	public void T_C4(){
		String expected = "ISOSCELES";
		int a = 4, b = 6, c = 6;
		String actual=tester.classifyTriangle(a, b, c);
		assertEquals(expected,actual);
	}
	
	@Test
	public void T_C5(){
		String expected = "SCALENE";
		int a = 4, b = 5, c = 6;
		String actual=tester.classifyTriangle(a, b, c);
		assertEquals(expected,actual);
	}
	
	
	@Test
	public void T_C6(){
		String expected = "NOT_TRIANGLE";
		int a = 3, b =3, c =7;
		String actual=tester.classifyTriangle(a, b, c);
		assertEquals(expected,actual);
	}
	@Test
	public void T_C7(){
		String expected = "NOT_TRIANGLE";
		int a = 3, b =7, c =3;
		String actual=tester.classifyTriangle(a, b, c);
		assertEquals(expected,actual);
	}
	@Test
	public void T_C8(){
		String expected = "NOT_TRIANGLE";
		int a = 7, b =3, c =3;
		String actual=tester.classifyTriangle(a, b, c);
		assertEquals(expected,actual);
	}

}
