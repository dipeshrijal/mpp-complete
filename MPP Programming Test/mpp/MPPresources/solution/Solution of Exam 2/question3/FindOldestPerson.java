package prob3.exam;

import java.util.List;

//DO NOT MODIFY METHOD SIGNATURE OR STATIC QUALIFIER
public class FindOldestPerson {
	public static Person findOldestPerson(List<Person> persons) {
		//implement
		persons.stream()
			.reduce((p1,p2) ->{
				if(p1.getAge() > p2.getAge())
					return p1;
				else
					return p2;
			}).get();                   
	}
	
	
}
