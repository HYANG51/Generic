package Generic;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapCountry {
	public static void main(String[] args) {
		HashMap<String, Integer> country = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int mm = 0;
		String cu2 ="";

		System.out.println("나라 이름과 인구를 5개 입력하세요.");
		for (int i = 0; i < 5; i++) {
			System.out.print("나라 이름, 인구 >>");

			String cu = sc.next();
			int mn = sc.nextInt();
			
			country.put(cu, mn);
			
			if (mm < mn) {
				mm = mn;
				cu2 = cu;
			}
		}
		System.out.println("가장 인구가 많은 나라는 "+ cu2 +"이고, 인구수는 "+mm+"명입니다.");
		sc.close();
	}
}
