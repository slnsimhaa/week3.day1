package week3.day1;

//import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student Name: Shyam sundar V");
	}

	public void studentDept() {
		System.out.println("Student Department: ECE");
	}

	public void studentID() {
		System.out.println("Student ID: 97");
	}

	public static void main(String[] args) {
		Student stud = new Student();
		stud.collegeCode();
		stud.collegeName();
		stud.collegeRank();
		stud.deptName();
		stud.studentName();
		stud.studentDept();
		stud.studentID();
	}

}