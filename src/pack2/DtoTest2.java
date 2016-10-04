package pack2;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class DtoTest2 {
	ArrayList<HaksaenDto> list;
	
	public DtoTest2() {
		list = new ArrayList<>();
	}
	
	public void inputData(String[] datas){
		//문자열자르기
		/*StringTokenizer toke = new StringTokenizer("kbs,mbc", ",");
		String ss1 = toke.nextToken();
		String ss2 = toke.nextToken();
		System.out.println(ss1 + " " + ss2);*/
		for (int i = 0; i < datas.length; i++) {
			StringTokenizer toke = new StringTokenizer(datas[i], ",");
			String irum = toke.nextToken();
			int kor = Integer.parseInt(toke.nextToken());
			int eng = Integer.parseInt(toke.nextToken());
			int mat = Integer.parseInt(toke.nextToken());
			//System.out.println(irum + " " + kor);
			HaksaenDto dto = new HaksaenDto();
			dto.setName(irum);
			dto.setKor(kor);
			dto.setEng(eng);
			dto.setMat(mat);
			list.add(dto);
			
			
		}
	}
	public void printData(){
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for (int i = 0; i < list.size(); i++) {
			HaksaenDto dto = new HaksaenDto();
			dto = list.get(i);
			int tot = dto.getEng() + dto.getKor() + dto.getMat();
			int avg = tot / 3;
			System.out.println(dto.getName() + "\t" + dto.getKor() +
					"\t" + dto.getEng() + "\t" + dto.getMat()+ "\t" + tot + "\t" + avg);
		}
		
		/*public void printData2(){
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
			for (HaksaenDto d:list) {
				HaksaenDto dto2 = new HaksaenDto();
				dto2 = list.get(d);
				int tot2 = dto2.getEng() + dto2.getKor() + dto2.getMat();
				int avg2 = tot2 / 3;
				System.out.println(dto2.getName() + "\t" + dto2.getKor() +
						"\t" + dto2.getEng() + "\t" + dto2.getMat()+ "\t" + tot2 + "\t" + avg2);
			}*/
	}
	public static void main(String[] args) {
		String [] datas = new String[3];
		datas[0] = "김밥,100,100,100";
		datas[1] = "비빔밥,80,85,88";
		datas[2] = "공기밥,75,90,78";
		
		DtoTest2 test2 = new DtoTest2();
		test2.inputData(datas);
		test2.printData();
	}

}
