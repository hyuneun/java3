package pack1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Testset {

	public static void main(String[] args) {//컬랙션
		// set : 중복불가, 순서x - hashSet 클래스가 일반적
		//컬렉션클래스<제네릭> 제네릭(컬렉션에 들어갈 타입을 제한한다)
		//wrapper class(포장클래스) 기본형<->참조형으로 바꿔준다(컬렉션은 참조형만 받으므로)
		//자바 1.5 이후에선 Boxing[unBoxing](자동으로 참조형<->기본형 변경) 이 있기때문에 잘 쓰이지않는다.
		HashSet<String> list = new HashSet<String>();
			//	  │							  └1.8부터 안써도된다
			//	  └모든클래스의 슈퍼클래스-모든타입을 받을수있다
		list.add("일");
		list.add("이");
		list.add("삼");
		list.add("사");
		list.add("오");
		list.add("육");
		System.out.println(list.size());//동일한 데이터가 들어오면 하나로취급한다
		list.remove("사");//값삭제
		System.out.println(list.size());
		//list.clear();//전체삭제
		//System.out.println(list.size());
		
		print(list);
		System.out.println();
		print(list.toArray());//배열로 변환
	}
	public static void print(Set set) {
		Iterator<String> iter = set.iterator();//자료를 나열할때 Iterator(반복자) 사용 
		while(iter.hasNext()){ // 
			//String ss = (String)iter.next(); //옛날방식(캐스팅해야함)
			String ss = iter.next();//캐스팅안해도된다(제네릭이 있기때문에)
			System.out.println(ss);
		}
	}

	public static void print(Object[] obj) {
		int count = obj.length;
		for(int i =0; i < count; i++){
			System.out.println(obj[i]);
		}
				
	}
}
