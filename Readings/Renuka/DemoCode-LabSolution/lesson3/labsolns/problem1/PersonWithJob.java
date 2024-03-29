package lesson3.labsolns.problem1;

public class PersonWithJob  {
	
	private Person person;
	private double salary;
	public String getName() {
		return person.getName();
	}
	public double getSalary() {
		return salary;
	}
	public Person getPerson() {
		return this.person;
	}
	PersonWithJob(String n, double s) {
		person = new Person(n);
		salary = s;
	}
	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		if(!(aPerson instanceof PersonWithJob)) return false;
		PersonWithJob p = (PersonWithJob)aPerson;
		boolean isEqual = this.getName().equals(p.getName()) &&
				this.getSalary()==p.getSalary();
		return isEqual;
	}
	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		PersonWithJob p3 = new PersonWithJob("Joe", 30000);
		//Person and PersonWithJob is not equal
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
		System.out.println("p1.equals(p3)? " + p1.equals(p3));
	}


}
