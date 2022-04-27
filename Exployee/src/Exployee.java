
public class Exployee {
	int id;
	String lastname, firstname;
	double salary;
	
	public Exployee()
	{
		id = 0;
		lastname = "NO NAME";
		firstname = "NO NAME";
		salary = 0.0;
	}
	public Exployee(int id, String lastname, String firstname, double salary) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getMonthlySalary()
	{
		return this.salary / 12;
	}
	
	public String toString()
	{
		return "ID = " + this.id + " / NAME=" + this.lastname + "," + this.firstname +
				 " / SALARY = &" + this.salary;
	}
	
}
