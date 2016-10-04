package pack1;

import java.io.FileReader;
import java.net.StandardSocketOptions;

public class TryTest {					 //throws 에러버림,chtch 에러캐치(권장)
	public void test1(){
		try {
			int[] arr = {1, 2, 3};
			//System.out.println(arr[5]);
			System.out.println(arr[1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("test1 a메소드에러 에러" + e);
		}
	}
	public static void main(String[] args) throws Exception {
		// 외부에서 값(키보드,파일 데이터베이스,네트워크)을 받을때 자바는 예외처리를 강요한다(안쓰면에러가떨어짐)
		//FileReader fr = new FileReader("c:\\work\\abc.txt");파일읽기
		int a = 10, b = 3;
		try{//시도
			int re = a / b;	//간접표현방식 권장 (수식에 직접 상수를 쓰자!)
			//int re = 10 / 3; 쓰지말자
			System.out.println("re : " + re);
	
			//TryTest test = null;
			TryTest test = new TryTest();
			test.test1();
			
		}catch (ArithmeticException e){//에러 캐치
			System.out.println("0으로 나누지 마세여");
		}catch (NullPointerException e) {
			System.out.println("참조오류" + e.getMessage());
			System.out.println("오류" + e);
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열범위오류" + e);
		}catch (Exception e){//다른 캐치 문장보다 위에있으면 위에서 다 걸리기 떄문에 아래에쓴다.
			System.out.println("나머지 모든에러 감지" + e);
		}finally {
			System.out.println("에러유무와 상관없이 반드시 수행");
		}
		
	
		System.out.println("종료");
	
	
	
	
	
	
	
	
	
	
	}
}
