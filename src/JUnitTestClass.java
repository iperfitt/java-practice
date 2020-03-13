import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class JUnitTestClass {

	public TestClass tc;

	@Before
	public void _setUp() {
		this.tc = new TestClass();
	}

	@Test
	void test1() {
		tc = new TestClass();
		//assertEquals(false, tc.almostPalindrome("abcdaaa"));
	}

}
