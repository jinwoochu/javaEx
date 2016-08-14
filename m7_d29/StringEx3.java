package m7_d29;

public class StringEx3 {
	public static void main(String[] args){
		char[] cArr= new char[0];
		String s= new String(cArr);
		
		System.out.println("cArr.length="+cArr.length);
		System.out.println("@@@"+s+"@@@");
	}
	
}


//길이가 0인 배열도 생성 가능하다  이것을 String형으로 만들면 그냥 아무것도 안들어가게 된다 한칸 띄운것이 아니라.