package pack2;

import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
	ArrayList<Test> list = new ArrayList<>();
	
	public void insertData(){
		Test StudDto = new Test();
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			try{
		System.out.println("이름입력");
		String i = sc.next();
		StudDto.setIrum(i);
		
		System.out.println("국어점수입력");
		int k = sc.nextInt();
		StudDto.setKo(k);
		
		System.out.println("영어점수입력");
		int e = sc.nextInt();
		StudDto.setEn(e);
		list.add(StudDto);
		
		System.out.println("계속하시겠습니까?(y/n)");
		String yn = sc.next();
		if(yn.equals("n")){
			return;	
		}
			}catch(Exception e){
				System.out.println("입력값 오류");
		}
		
	}
			
}
	
	public void showDate(){
		System.out.println("이름  국어  영어  총점");
		
		for(int i =0; i < list.size(); i++){
			Test StudDto = new Test();//꺼내기위한 장소생성
			StudDto = list.get(i);
			int t = StudDto.getEn() + StudDto.getKo();
			System.out.println(StudDto.getIrum() + "    " + StudDto.getKo() + "    " + StudDto.getEn() + "    " + t);
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		Test t1 = new Test();
		t2.insertData();
		t2.showDate();
		

	}
}
