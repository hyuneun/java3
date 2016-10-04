package pack4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class FileIoTest1 {
	// 1byte 단위로 자료처리 : class의 이름에 stream이 들어있다.
	// 모든 형태의 자료를 처리 ctrl + shift + f 자동 줄정렬
	// Buffer : 정보를 입출력할때 데이터에 완충공간을 마련하여 속도를 향상시키는 기능
	// BufferWriter : 문자열 스트림에 연결해 버퍼를 제공하는 보조스트림
	// OutputStreamWriter : 바이트 출력 스트림에 연결되어 Writer로 변환
	// FileOutputStream : 바이트 단위로 자료를 저장하는 바이트 기반 출력전용 스트림
	
	//정리 하자면 하나의 문자열에 대해 다른 문자열이 자주 추가되는 경우에는 StringBuffer와 StringBuilder가 유리하지만, 
	//그 외의 용도에서는 오히려 StringBuffer나 StringBuilder가 훨씬 메모리 자원 낭비될 수 있다. 
	//그리고 항상 multi-thread safety해야 하는 경우 StringBuffer를 이용하고 아니라면 StringBuilder를 사용하자.
	
	
	 public void write_file(File file, ArrayList<String> str_list) {
		try {
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
			for (String str : str_list) {
				writer.write(str, 0, str.length());
				writer.newLine();// 라인스킵
			}
			writer.close();
		} catch (Exception e) {
			System.out.println("write" + e);
		}
	}

	public void read_file(File file) {
		try {
	// BufferWriter : 문자열 스트림에 연결해 버퍼를 제공하는 보조스트림
	// OutputStreamWriter : 바이트 출력 스트림에 연결되어 Reader로 변환
	// FileOutputStream : 바이트 단위로 모든자료를 읽는 바이트 기반 출력전용 스트림
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			String oneline;
			// String imsi = "";
			StringBuffer buffer = new StringBuffer(); // 문자열을 누적할땐
												// Stringbuffer,Stringbuild사용
			while ((oneline = reader.readLine()) != null) {
				// System.out.println(oneline);
				//imsi += oneline + "\n"; // 문자열은 절대 누적하지않는다(속도↓)
				buffer.append(oneline + "\n");//이렇게출력
			}
			reader.close();
			//System.out.println(imsi);
			System.out.println(buffer.toString());
		} catch (Exception e) {
			System.out.println("read" + e);
		}
	}

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("롤롤롤");
		list.add("럴럴럴");
		File file = new File("c:/work/abc.txt");

		FileIoTest1 t1 = new FileIoTest1();
		t1.write_file(file, list);
		t1.read_file(file);

	}
}
