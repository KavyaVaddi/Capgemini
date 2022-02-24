
class Employee {
   long employeeId;
   String employeeName;
   String employeeAddress;
   long employeePhone;
   double basicSalary;
   double specialAllowance = 250.80;
   double Hra = 1000.50;
   public Employee(long Id, String Name, String address, long phone) {
	  super();
	  employeeId = Id;
	  employeeName = Name;
	  employeeAddress = address;
	  employeePhone = phone;
   }
   public double calculateSalary() {
	   double salary = basicSalary + ( basicSalary * specialAllowance/100 ) + ( basicSalary * Hra/100 );
	   return salary;
   }
   public double calculateTransportAllowance() {
	   double transportAllowance = basicSalary * 0.1;
	   return (calculateSalary() + transportAllowance);
   }
}
class Manager extends Employee{

	public Manager(long Id, String Name, String address, long phone, double salary) {
		super(Id, Name, address, phone);
		basicSalary = salary;
	}
	public double calculateTransportAllowance() {
		   double transportAllowance = basicSalary * 0.15;
		   return (calculateSalary() + transportAllowance);
	}
	
}
class Trainee  extends Employee{

	public Trainee(long Id, String Name, String address, long phone, double salary) {
		super(Id, Name, address, phone);
		basicSalary = salary;
	}
	
}
public class InheritanceActivity{
	public static void main(String[] args) {
		Manager m = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
		System.out.println("Manager Salary = "+m.calculateSalary());
		Trainee t = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
		System.out.println("Trainee Salary = "+t.calculateSalary());
		System.out.println("Manager Salary after transport allowance calculation = "+m.calculateTransportAllowance());
		System.out.println("Trainee Salary after transport allowance calculation = "+t.calculateTransportAllowance());
	}
}
