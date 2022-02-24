import java.util.Scanner;

class Student{
	private int studentId;
	private String studentName;
	private String studentAddress;
	private String collegeName;
	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegeName = "NIT";
	}
	public Student(int studentId, String studentName, String studentAddress, String collegeName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegeName = collegeName;
	}
	public void display() {
		System.out.println("studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", collegeName=" + collegeName );
	}
}
public class StudentMain {
   public static void main(String[] args) {
	   boolean b=true;
	   int studentId;
	   String studentName,studentAddress,collegeName;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter Student's Id:");
	   studentId=sc.nextInt();
	   System.out.println("Enter Student's Name:");
	   studentName=sc.nextLine();
	   System.out.println("Enter Student's address:");
	   studentAddress=sc.nextLine();
	   while(b) { 
		   System.out.println("Whether the student is from NIT(Yes/No):");
		   String choice=sc.nextLine();
		   if(choice.equals("Yes")){
			   Student s=new Student(studentId,studentName,studentAddress);
			   s.display();
			   b=false;
		   }
		   else if(choice.equals("No")) {
			   System.out.println("Enter the collegename:");
			   collegeName=sc.nextLine();
			   Student s=new Student(studentId,studentName,studentAddress,collegeName);
			   s.display();
			   b=false;
		   }
		   else {
			   System.out.println("Wrong Input");
		   }
	   }
	   
	   sc.close();
	}
}
