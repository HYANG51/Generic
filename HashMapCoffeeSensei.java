package Generic;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapCoffeeSensei {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();

		map.put("에스프레소", 2000);
		map.put("아메리카노", 2500);
		map.put("카푸치노", 3000);
		map.put("카페라떼", 3500);

		System.out.println("에스프레소, 아메리카노, 카푸치노, 카페라떼 있습니다.");

		while (true) {
			try {
				System.out.print("주문 >> ");
				String order = sc.next();
				if (order.equals("그만"))
					break;

				if (map.get(order) == null) {
					System.out.println("없는 메뉴입니다. 다시 입력해주세여.");
					continue;
				}

				System.out.println(order + "는 " + map.get(order) + "원 입니다.");

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("잘못된입력입니다. 다시입력해주세요.");
			}
			sc.close();
		}
	}
}

