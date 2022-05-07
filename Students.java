package week3.day1;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Student ID: " + id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("Student ID: " + id);
		System.out.println("Student Name: " + name);
	}

	public void getStudentInfo(String email, long phone) {
		System.out.println("Student Email: " + email);
		System.out.println("Student Phone Number: " + phone);
	}

	public static void main(String[] args) {
		Students stud = new Students();
		stud.getStudentInfo(97);
		stud.getStudentInfo(97, "Lakshminarasimhan");
		stud.getStudentInfo("gsnarsi@gmail.com", 9840705697l);
	}
}