package javasysprops;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class JavaSysPropsLibTest {

	@Test
	void test() {
		JavaSysPropsLib jspl = new JavaSysPropsLib();
		assertTrue(jspl.compareSystemProperties());
	}
}