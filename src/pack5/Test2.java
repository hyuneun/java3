package pack5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Test2{
	ArrayList<Test1> list = new ArrayList<>();
	
	public void insert(File file) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader(file));
		String oneline;
		
		while((oneline = br.readLine()) != null){
			String arr [] = oneline.split(",");
			
			String a = arr[0] + "\t";
			String b = arr[1] + "\t";
			String c = arr[2] + "\t";
			String d = arr[3] + "\t";
			String e = arr[4] + "\t";
			
			Test1 t1 = new Test1();
			t1.setBun(a);
			t1.setIrum(b);
			t1.setBuya(c);
			t1.setDeng(d);
			t1.setTime(e);
			list.add(t1);
			
		}
		br.close();
	}
	
	public void show(){
			System.out.println("번호\t이름\t분야\t등록일\t\t시간");
			for(Test1 t1: list){
				System.out.println(t1.getBun() + t1.getIrum() + t1.getBuya() + t1.getDeng() + t1.getTime());
			}
			System.out.println("건수" + list.size() + "건");
	}
	
	
	public static void main(String[] args) throws Exception {
		Test2 t2 = new Test2();
		File file = new File("c:/work/kbs.csv");
		t2.insert(file);
		t2.show();

	}

	
	
}
