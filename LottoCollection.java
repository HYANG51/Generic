package Generic;

import java.util.HashSet;
import java.util.Set;

public class LottoCollection {
	public static void main(String[] args) {

		//Set<Integer> lottoSet = new HashSet<Integer>();		
		Set<Integer> lottoSet = new HashSet<>();
		// 위 아래 둘 다 상관 X. 걍 인티저인데 스트링넣고 이런거만 안하면 됨.

		while(lottoSet.size() != 6) {
			int num = (int)(Math.random()*46 + 1);
			lottoSet.add(num);
		}

		for (int num : lottoSet) {
			System.out.print(num + " ");
		}
	}
}
