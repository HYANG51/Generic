package Generic;

import java.util.HashSet;

class Person2 {
	private String name;
	private int age;

	public Person2(String name,int age) {
		this.name = name;
		this.age = age;
	}

	//LEE(10세)
	@Override
	public String toString() {      
		return name + "(" + age + "세)";
	}

	@Override
	public int hashCode() {      
		return age;
	}

	@Override
	public boolean equals(Object obj) {

		if(obj instanceof Person2) {
			Person2 you = (Person2) obj;

			if(this.name.equals(you.name))
				return true;
		}

		return false;
	}
}
public class PersonHashCodeEquals {
	public static void main(String[] args) {
		HashSet<Person2> hSet = new HashSet<Person2>();
		hSet.add(new Person2("LEE", 10));
		hSet.add(new Person2("LEE", 10));
		hSet.add(new Person2("PARK", 35));
		hSet.add(new Person2("PARK", 35));

		System.out.println("저장된 데이터 수: " + hSet.size());
		System.out.println(hSet);

		/*
		============
		저장된 데이터 수: 2
		[LEE(10세), PARK(35세)]
		 */
	}
}
