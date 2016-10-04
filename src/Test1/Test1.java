package Test1;

import java.util.ArrayList;
import java.util.StringTokenizer;

import pack2.Test;


public class Test1 {
	Test2 t2 = new Test2();
	int g;
	double gong;
	ArrayList<Test2> list = new ArrayList<>();
	
	
	
	public void inputData(String[] datas){
		
		
		for (int i = 0; i < datas.length; i++) {
		StringTokenizer toke = new StringTokenizer(datas[i], ",");
		
		String i1 = toke.nextToken();
		
		int s = Integer.parseInt(toke.nextToken());
		
		int g = Integer.parseInt(toke.nextToken());
		
		int e = Integer.parseInt(toke.nextToken());

		t2.setIrum(i1);
		t2.setSabum(s);
		t2.setGibun(g);
		t2.setEpsa(e);
		list.add(t2);
		}
		
		
		
		
	}
	
	
	public void showDate(){
		System.out.println("사번\t이름\t기본급\t근무년수\t근속수당\t공제액\t수령액");
		
		for(int i =0; i < list.size(); i++){
			
			Test2 t2 = new Test2();//꺼내기위한 장소생성
			t2 = list.get(i);
			int n = 2016 - t2.getEpsa();
			if(n <= 3){
				 g = 150000;
			}else if(n <= 8){
				 g = 450000;
			}else if(n >= 9){
				 g = 1000000;
			}
			int gu = t2.getGibun() + g;
			if(gu >= 3000000){
				gong = 0.5; 
			}else if(gu >= 2000000){
				gong = 0.3;
			}else if(gu < 2000000){
				gong = 0.15;
			}
			double su = t2.getGibun() + g - gong;
			double gongg = (t2.getGibun() + g) * gong;
			System.out.println(t2.getSabum() + "\t" + t2.getIrum() + "\t" + t2.getGibun() + "\t" + n + "\t" + g + "\t" + gongg + "\t" + su);
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		Test1 t1 = new Test1();
		t1.inputData(args);
		t1.showDate();
	}

























}

	
	
	
	

