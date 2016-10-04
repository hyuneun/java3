package pack4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class IoTest1 {

	public static void main(String[] args) throws Exception{
		//1byte 단위 IO : stream 데이터를 입출력을 도와주는 흐름
		/*
		System.out.println("1바이트입력"); 
		int a = System.in.read();
		System.out.println(a + " " + (char)a);
		*/
		System.out.println();
		//문자열출력 stream
		OutputStreamWriter os = new OutputStreamWriter(System.out);
		/*
		byte b = 97;
		os.write(b);
		os.flush();//stream 처리마무리
		*/
		BufferedWriter bw = new BufferedWriter(os);
		PrintWriter out = new PrintWriter(bw);
		out.println(123);
		out.print("문자열출력");
		out.close();//자원반납(해제)
		bw.close();
		os.close();
		
		System.out.println();
		//파일로 출력 : 2byte  단위 출력
		File f = new File("c:/work/iotest.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw1 = new BufferedWriter(fw);
		PrintWriter out1 = new PrintWriter(bw1);
		out1.println(1234);
		out1.println("오늘은 금요일");
		out1.print("쉰다");
		out1.print("롤해야지");
		out1.close();//밖에서부터 닫는다
		bw1.close();
		fw.close();
		
		System.out.println("파일저장완료");
		File f2 = new File("c:/work/iotest.txt");
		FileReader fr = new FileReader(f2);
		BufferedReader br2 = new BufferedReader(fr);
		while(true){ // eof까지 읽기 계속
			String str = br2.readLine();
			if(str == null) break;
			System.out.println(str);
			
		}
		br2.close();
		fr.close();
		
		
		
		
		
		
		
		
		
		
		
	}
}
