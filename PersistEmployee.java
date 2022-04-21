import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employeee implements Serializable{
	int employeeId;
	String name;
	float appraisalRating;
	
	public Employeee() {
		super();
	}
	
	public Employeee(int employeeId, String name, float appraisalRating) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.appraisalRating = appraisalRating;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAppraisalRating() {
		return appraisalRating;
	}
	public void setAppraisalRating(float appraisalRating) {
		this.appraisalRating = appraisalRating;
	}
	
}
class EmployeeUtility{
	public boolean addEmployee(String fileName,ArrayList<Employeee> employeeList) throws IOException {
		try {  
			  FileOutputStream fout=new FileOutputStream(fileName);    
			  ObjectOutputStream out=new ObjectOutputStream(fout);    
			  out.writeObject(employeeList);
			  out.flush();       
			  out.close();    
			  System.out.println("success");    
		}
		catch(Exception e){
			System.out.println(e);
		}       
		return true;
		
	}
	
	public Employeee viewEmployeeById(String fileName,int employeeId) {
		try{  
			  ObjectInputStream in=new ObjectInputStream(new FileInputStream(fileName));  
			  ArrayList<Employeee> al = (ArrayList)in.readObject(); 
			  //Employeee e = (Employeee)in.readObject();     
			  in.close();  
			  for(Employeee e : al) {
				  if(e.getEmployeeId() == employeeId)
					  return e;
				  else
					  continue;
			  }
		}
		catch(Exception e){
			System.out.println(e);
		}   
		return null;
		
	}
}
public class PersistEmployee {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	Employeee employee = new Employeee();
    	EmployeeUtility employeeutility = new EmployeeUtility();
    	ArrayList<Employeee> list = new ArrayList<Employeee>();
    	int n ;
    	System.out.println("1.Add details\n2.Rerieve details");
    	int choice = sc.nextInt();
    	switch(choice) {
    	case 1:
    		System.out.println("Enter the no of employees: ");
    		n = sc.nextInt();
        	System.out.println("Enter the details");
        	try {
        		for(int i=0; i<n; i++) {
        			System.out.println("Enter the Emp id:");
        			employee.employeeId = sc.nextInt();
        			sc.nextLine();
        			System.out.println("Enter emp name:");
        			employee.name = sc.nextLine();
        			System.out.println("Enter appraisal rate of emp:");
        			employee.appraisalRating = sc.nextFloat();
            		list.add(employee);
            	}
            	employeeutility.addEmployee("f.txt", list);
        	}
        	catch(Exception e) {
        		System.out.println(e);
        	}
        	break;
    	case 2:
    		employee = employeeutility.viewEmployeeById("f.txt", 103);
        	if(employee == null) {
        		System.out.println("No employee is present with the given emp id");
        	}
        	else {
        		System.out.println(employee.employeeId+" "+employee.name+" "+employee.appraisalRating);
        	}
        	break;
    	default:
    		System.out.println("Invalid option");
    	}
    }
}
