package Test1;

import java.util.ArrayList;
import java.util.Scanner;



public class Test4 {
	ArrayList<Test3> list = new ArrayList<>();
	String z;
	int dan,sa,gam,sog1,sog2,sog3,total;

	public void insertData(){
		
		
		
		
		while(true){
		Scanner sc = new Scanner(System.in);	
		Test3 t3 = new Test3();
		System.out.println("지역코드/상품명/수량입력");
		String ss = sc.next();
		String[] arr = ss.split(",");
		
		int c = Integer.parseInt(arr[0]);
		int su = Integer.parseInt(arr[2]);
		
		t3.setcode(c);
		t3.setSangpum(arr[1]);
		t3.setSu(su);
		list.add(t3);
		
		
		System.out.println("계속하시겠습니까?(y/n)");
		String yn = sc.next();
		if(yn.equals("n")){
			return;	
		}
			sc.close();//프로그램을 닫는다
		
	}
			
}
	
	public void showDate(){
		System.out.println("지역\t상품명\t수량\t단가\t금액");
		
		for(int i =0; i < list.size(); i++){
			Test3 t3 = new Test3();//꺼내기위한 장소생성
			t3 = list.get(i);
			
			if(t3.getcode() == 100){
				z = "강북";
			}else if(t3.getcode() == 200){
				z = "강남";
			}else if(t3.getcode() == 300){
				z = "강서";
			}
			
			
			if(t3.getSangpum().equals("새우깡")){
				dan = 450;
				sa++;
				sog1 += (450 * t3.getSu());
			}else if(t3.getSangpum().equals("감자깡")){
				dan = 300;
				gam++;
				sog2 += (300 * t3.getSu());
			}
			int money = (t3.getSu() * dan);
			System.out.println(z + "\t" + t3.getSangpum() + "\t" + t3.getSu() + "\t" + dan + "\t" + money);
			
		}
		System.out.println();
		sog3 = sog1 + sog2;
		total = gam + sa;
		System.out.println("소계\t 감자깡:" + gam + "건\t 소계액" + sog2);
		System.out.println("  \t 새우깡:" + sa + "건\t 소계액" + sog1);
		System.out.println("총건수 : " + total + "\t 총액 : " + sog3);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		Test4 t4 = new Test4();
		t4.insertData();
		//t4.showDate();
		
		
		
		
		
	}
}