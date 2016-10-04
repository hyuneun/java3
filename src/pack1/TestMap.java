package pack1;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;


public class TestMap {
	
	public static void main(String[] args) {
		//Map류 : 자료를 키와 값으로 분리해 저장, 검색에 용이(사전형)
		//HashMap<K, V>
		//	    키┘  └값
		HashMap<String, String> list = new HashMap<>();
		list.put("0", "lee");
		list.put("1", "kim");
		list.put("2", "park");
		list.put("3", "choi");
		list.put("1", "lee");
		System.out.println(list.size());
		//값은 중복이 허용되나 키는 중복이 안된다
		System.out.println(list.containsKey("1"));//키확인
		System.out.println(list.containsValue("hi"));//값확인
		list.remove("2");
		print(list);
		
	}
	
	public static void print(Map map) {
		Set set = map.keySet(); // 키값을 set type로 전달
		Iterator iter = set.iterator();
		while(iter.hasNext()){
			String key = (String)iter.next();
			System.out.println(key + " " + map.get(key));
		}
		
	}
}
