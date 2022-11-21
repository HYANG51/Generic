package Generic;

import java.util.HashSet;

class Num1 {
	private int num;

	public Num1(int n) {
		num = n;
	}

	@Override
	public String toString() {
		return String.valueOf(num);
	}

	@Override
	public int hashCode() {
		System.out.println("hashCode()");
		return num % 13;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals");

		if(num == ((Num1)obj).num)
			return true;
		else
			return false;
	}    
}

class HashSetEquality {
	public static void main(String[] args) {    
		HashSet<Num1> set = new HashSet<>();

		set.add(new Num1(7799));
		set.add(new Num1(9955));
		set.add(new Num1(7799));

		System.out.println("인스턴스 수: " + set.size());

		for(Num1 n : set)
			System.out.print(n.toString() + '\t');

		System.out.println();
	}
}
