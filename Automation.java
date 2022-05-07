package week3.day1;

public class Automation implements sTestTool {

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Test Tool - Selenium");
	}

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Language - Java");
	}

	public void language() {
		System.out.println(name);
		this.Java();
	}

	public void TestTool() {
		System.out.println(name1);
		System.out.println(super.hashCode());
	}

	public static void main(String[] args) {
		Automation auto = new Automation();
		auto.Selenium();
		auto.Java();
		//auto.language();
		auto.TestTool();
	}

}