
public class Demo {

	private String s1, s2;

	public Demo(String s1, String s2) {
		this.s1 = s1;
		this.s2 = s2;
	}

	public int lengthOfString() {
		return s1.length() + s2.length();
	}

	public String getS1() {
		return s1;
	}

	public void setS1(String s1) {
		this.s1 = s1;
	}

	public String getS2() {
		return s2;
	}

	public void setS2(String s2) {
		this.s2 = s2;
	}

}