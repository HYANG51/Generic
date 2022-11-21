package Generic;
class Box3<T> {
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}
public class FruitAndBoxFault_Generic {
	public static void main(String[] args) {
		Box3<Apple> aBox = new Box3<Apple>();
		Box3<Apple> aaBox = new Box3<Apple>();
		Box3<Orange> oBox = new Box3<Orange>();
		
		aBox = aaBox;
		
		// 과일을 박스에 담은 것일까?
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		// 박스에서 과일을 제대로 꺼낼 수 있을까?
		Apple ap = aBox.get();
		Orange og = oBox.get();
		
		System.out.println(ap);
		System.out.println(og);
		
	}
}
