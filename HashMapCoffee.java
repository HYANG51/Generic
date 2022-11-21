package Generic;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*HashMap<String, Integer> 컬렉션을 생성하고
 “에스프레소”는 2000, “아메리카노”는 2500, “카푸치노”는 3000, “카페라테”는 3500을 저장하라. 
 그리고 다음과 같이 음료수 이름을 입력받으면 HashMap에서 검색하여 가격을 출력하라.*/
public class HashMapCoffee {
	public static void main(String[] args) {
		HashMap<Integer, String> menu = new HashMap<>();
		boolean quit = true;
		
		menu.put(2000, "에스프레소");
		menu.put(2500, "아메리카노");
		menu.put(3000, "카푸치노");
		menu.put(3500, "카페라테");
		
		Set<Integer> ks = menu.keySet();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("에스프레소, 아메리카노, 카푸치노, 카페라테 있습니다.");
		
		while (quit) {
			System.out.print("주문 >> ");
			
			String select = sc.next();
			
			switch (select) {
			case "에스프레소":
				for (Integer n : ks) {
					if (menu.get(n).toString().equals("에스프레소")) {
						System.out.println(menu.get(n)+"는 " + n +"원 입니다.");
					}
				}
				break;
				
			case "아메리카노":
				for (Integer n : ks) {
					if (menu.get(n).toString().equals("아메리카노")) {
						System.out.println(menu.get(n)+"는 " + n +"원 입니다.");
					}
				}
				break;
				
			case "카푸치노":
				for (Integer n : ks) {
					if (menu.get(n).toString().equals("카푸치노")) {
						System.out.println(menu.get(n)+"는 " + n +"원 입니다.");
					}
				}
				break;
				
			case "카페라테":
				for (Integer n : ks) {
					if (menu.get(n).toString().equals("카페라테")) {
						System.out.println(menu.get(n)+"는 " + n +"원 입니다.");
					}
				}
				break;
				
			default:
				System.out.println("그런 메뉴는 없어요.");
				quit = false;
				break;
			}
		}
	}
}
