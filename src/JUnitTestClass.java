import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class JUnitTestClass {

	public BinarySearchRecursion tc;

	@Before
	public void _setUp() {
		this.tc = new BinarySearchRecursion();
	}

	@Test
	void test1() {
		tc = new BinarySearchRecursion();
		//assertEquals(false, tc.almostPalindrome("abcdaaa"));
	}

}
