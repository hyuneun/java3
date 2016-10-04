package pack1;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class TestList {

	public static void main(String[] args) {
		// List : 순서가있고 중복을 허용한다
		ArrayList<String> list = new ArrayList<>();
		list.add("lee");
		list.add("kim");
		list.add("jang");
		list.add("kyo");
		list.add("hee");
		list.add("lee");
		list.add("see");
		list.add("oee");
		System.out.println(list.size());
		System.out.println(list.contains("kim"));//값이 있는지확인
		list.remove("kim");
		System.out.println(list.size());
		list.remove(0);//0번째의값삭제
		System.out.println(list.size());
		System.out.println(list.indexOf("kyo"));//값의 위치확인
		List li = list.subList(0, 2);//지정된 범위에 있는 값을 반환한다(출력아님)
		System.out.println(li);
		System.out.println();
		print(list);
	}

	public static void print(List list) {
		Iterator<String> iter = list.iterator();//자료를 나열할때 Iterator(반복자) 사용 
		while(iter.hasNext()){ // 자료가있으면 참
			//String ss = (String)iter.next(); //옛날방식(캐스팅해야함)
			String ss = iter.next();//캐스팅안해도된다(제네릭이 있기때문에)
			System.out.println(ss);
		}
	}
}
