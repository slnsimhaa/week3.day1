package week3.day1;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("The size of the desktop is '1280×720 '");

	}

	public static void main(String[] args) {
		Desktop des = new Desktop();
		des.computerModel();
		des.desktopSize();
	}
}