package Generic;
class Apple{
	public String toString() { return "I am an apple."; }
}

class Orange{
	public String toString() { return "I am an orange."; }
}

// 다음 상자는 사과도 오렌지도 담을 수 있다.
class Bbox{
	private Object ob;

	public void set(Object o) { ob = o; }
	public Object get() { return ob; }
}
public class FruitAndBox {
	public static void main(String[] args) {
		Bbox aBox = new Bbox();
        Bbox oBox = new Bbox();

        // 과일을 박스에 담은 것일까? 
        aBox.set("Apple");
        oBox.set("Orange");

        System.out.println(aBox.get());
        System.out.println(oBox.get());
    }
}
		/*Bbox aBox = new Bbox();
		Bbox oBox = new Bbox();

		// 과일을 박스에 담은 것일까? 
		aBox.set("Apple");
		oBox.set("Orange");

		// 박스에서 과일을 제대로 꺼낼 수 있을까?
		Apple ap = (Apple)aBox.get();
		Orange og = (Orange)oBox.get();

		System.out.println(ap);
		System.out.println(og);
	}
}*/
