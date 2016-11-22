package Source;

import junit.framework.TestCase;

public class TestCases extends TestCase{
	Calculate Calculate =new Calculate();
	void TestCase1(){
		String expression="2,4,+";
		assertEquals(6,Calculate.Operations(expression));		
	}
	void TestCase2(){
		String expression="2,4,-";
		assertEquals(2,Calculate.Operations(expression));		
	}
	void TestCase3(){
		String expression="2,4,*";
		assertEquals(8,Calculate.Operations(expression));		
	}
	void TestCase4(){
		String expression="4,2,/";
		assertEquals(2,Calculate.Operations(expression));		
	}
	void TestCase5(){
		String expression="4,2,%";
		assertEquals(0,Calculate.Operations(expression));		
	}

}
