import static org.junit.Assert.*;

import org.junit.Test;

public class testTest {

/*Condition
 * 1. 		if ((a>1) && (b<2)){
 * 2.			d = a + b;}
 * 3. 		if ((c<=5)){
 * 4. 			c = c * 3;}
		
		*/
	@Test
	public void testRun1() {
		test t = new test();
		assertEquals(t.ta(10,-1,6),"A=10,B=-1,C=6,D=9");
		//Condition 1,2,3 (TF)
	}
	
	@Test
	public void testRun2() {
		test t = new test();
		assertEquals(t.ta(2,5,1),"A=2,B=5,C=3,D=0");
		//Condition 1,3,4 (FT)
	}

	@Test
	public void testRun3() {
		test t = new test();
		assertEquals(t.ta(1,5,7),"A=1,B=5,C=7,D=0");
		//Condition 1,3  (FF)
	}

	@Test
	public void testRun4() {
		test t = new test();
		assertEquals(t.ta(3,1,5),"A=3,B=1,C=15,D=4");
		//Condition 1,2,3,4 (TT)
	}
}
