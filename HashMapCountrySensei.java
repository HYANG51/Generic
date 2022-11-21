package Generic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapCountrySensei {
	public static void main(String[] args) {
		final int MAX_NATION = 5;	// 나라 몇개 입력받을건지.

		Map<String, Integer> nationMap = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("나라 이름과 인구를 5개 입력하세요.");
			for (int i = 0; i < MAX_NATION; i++) {
				System.out.print("나라 이름, 인구 >> ");

				String nation = sc.next();
				int population = sc.nextInt();

				nationMap.put(nation, population);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("잘못된 입력입니다.");
			System.out.println("프로그램을 종료합니다.");
			return;
		}

		int max = 0;
		String country = null;

		Set<String> keys = nationMap.keySet();

		for (String key : keys) {

			int popu = nationMap.get(key);

			if(popu > max) {
				max = popu;
				country = key;
			}
		}
		System.out.println("제일 인구가 많은 나라는 (" + country + ") 이고, 인구수는 " + nationMap.get(country) + "명 입니다.");
	}
}
