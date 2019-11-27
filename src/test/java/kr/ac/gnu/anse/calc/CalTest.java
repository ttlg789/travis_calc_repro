package kr.ac.gnu.anse.calc;

import static org.junit.Assert.*;
import org.junit.Test;

import kr.ac.gnu.anse.calc.Calc;

public class CalTest{
	@Test
	public void testAdd() {
		Calc c = new Calc();
		assertEquals(30, c.add(10,20));
	}
}
