package pack3;

public class StringParse {
	
	public static void main(String[] args) {
		String ss = "하하 호호,abc 12 ABCD ab a";
		String[] arr = ss.split(","); //정규표현식으로 문자열자르기
		for(String a:arr){
			System.out.println(a);
		}
	}
}
