package pack1;

import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		// List의 서브클래스
		Vector<Object> v = new Vector<>();
		v.add("a"); //Boxing
		v.addElement("한국인");
		v.add(100);
		v.add(123.456);
		TestVector tv = new TestVector();
		v.add(tv);
		System.out.println(v.size());
		System.out.println(v.elementAt(1));
		
		System.out.println();
		
		for(Object obj:v){
			System.out.println(obj);
		}
		
	}

}
