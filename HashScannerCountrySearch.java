package Generic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
1.아래를 작성 하시오.프로그래밍
나라 이름과 인구를 입력하세요.(예: Korea 5000)
나라 이름, 인구 >> Korea 5000
나라 이름, 인구 >> USA 1000000
나라 이름, 인구 >> Swiss 2000
나라 이름, 인구 >> France 3000
나라 이름, 인구 >> 그만

인구 검색 >> France
France의 인구는 3000
인구 검색 >> 스위스
스위스 나라는 없습니다.
인구 검색 >> 그만
 */


public class HashScannerCountrySearch {
	public static void main(String[] args) {
		Map<String,Integer> countryMap = new HashMap<>();

		System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");    

		//출력
		while(true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("나라 이름, 인구 >>");

				String county = sc.next();

				if(county.equals("그만"))
					break;


				int popu = sc.nextInt();

				countryMap.put(county, popu);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("잘못된 입력입니다.");
			}         
		}

		while(true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("인구 검색 >>");

				String county = sc.next();

				if(county.equals("그만"))
					break;

				if(countryMap.containsKey(county)) {
					System.out.println(county + " 의 인구수는" + countryMap.get(county) + "명 입니다.");
				}else {
					System.out.println("[" + county + "] 나라는 없습니다.");
				}      

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("잘못된 입력입니다.");
			}         
		}
	}
}