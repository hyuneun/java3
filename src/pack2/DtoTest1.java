package pack2;

import java.net.StandardSocketOptions;
import java.util.ArrayList;

public class DtoTest1 {
	ArrayList<StudentDto> list = new ArrayList<>();
	
	//DTO type 유추
	public void aa(){
		String[] persons = new String[3];
		persons[0] = "홍길동";
		persons[1] = "소길동";
		persons[2] = "서길동";
		
		for (String s:persons){
			System.out.println(s);
		}
	}
	
	//DTO type으로 자료저장
	public void insertData(){
		StudentDto dto = null;
		dto = new StudentDto();  // Data transfer object: 레코드단위의 자료처리용 기억장소
		dto.setHakbun("ks10");
		dto.setIrum("손오공");
		dto.setJumsu(90);
		list.add(dto);//1명 저장
		
		dto = new StudentDto();  // Data transfer object: 레코드단위의 자료처리용 기억장소
		dto.setHakbun("ks20");
		dto.setIrum("저팔계");
		dto.setJumsu(100);
		list.add(dto);//2명째 저장
		
		dto = new StudentDto();  // Data transfer object: 레코드단위의 자료처리용 기억장소
		dto.setHakbun("ks30");
		dto.setIrum("사오정");
		dto.setJumsu(70);
		list.add(dto);//3명째 저장
	}
	
	public void showDate(){
		System.out.println("학생수는 : " + list.size());
		
		for(int i =0; i < list.size(); i++){
			StudentDto dto = new StudentDto();//꺼내기위한 장소생성
			dto = list.get(i);
			System.out.println(dto.getHakbun() + dto.getIrum() + dto.getJumsu());
		}
		/*for(int i:list.){
			StudentDto dto = new StudentDto();//꺼내기위한 장소생성
			dto = list.get(i);
			System.out.println(dto.getHakbun() + dto.getIrum() + dto.getJumsu());
		}*/
	}
	
	
	public static void main(String[] args) {
		DtoTest1 test1 = new DtoTest1();
		test1.aa();
		test1.insertData();//DTO타입으로 컬렉션에 담기
		test1.showDate();//DTO타입으로 컬렉션에 자료 읽은 후 출력

	}

}
