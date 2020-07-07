package javasysprops;

public class JavaSysPropsLib {

	/**
	 * Loads the two example properties and compares them with expected values.
	 * 
	 * @return true, if values are correct.
	 */
	public boolean compareSystemProperties() {
		String prop1 = System.getProperty("my key 1");
		String prop2 = System.getProperty("mykey2");
		return "my val 1".equals(prop1) && "myval2".equals(prop2);
	}
}
