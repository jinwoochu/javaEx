package m8_d13;

import java.util.StringJoiner;

public class StringEx5 {
	public static void main(String[] args) throws Exception{
		String str="가";
		
		byte[] bArr = str.getBytes("UTF-8");
		byte[] bArr2 = str.getBytes("CP949");
		//바이트 배열에 문자열을 저장하는데 그 방식을 UTF-8, CP949로 한것.
		
		System.out.println("UTF-8:" + joinByteArr(bArr));
		System.out.println("CP949:" + joinByteArr(bArr2));
		
		System.out.println("UTF-8:" + new String(bArr, "UTF-8"));
		System.out.println("CP949:" + new String(bArr2, "CP949"));
		//배열에 저장된 값들을 문자열로 만드는데, 그 인코딩 방식을 지정해준것 ^^;;
	}
	
	static String joinByteArr(byte[] bArr){
		StringJoiner sj= new StringJoiner(":","[","]");
		
		for(byte b:bArr)
			sj.add(String.format("%02X",b));
		return sj.toString();
	}
}
