package m8_d13;

public class StringBufferEx1 {
	public static void main(String[] args){
		StringBuffer sb= new StringBuffer("abc");
		StringBuffer sb2=new StringBuffer("abc");
		
		System.out.println("sb==sb2 ? "+(sb==sb2)); //여기서도 주소값으로 계산하기 때문에 false가 나옴
		System.out.println("sb.equals(sb2) ? "+sb.equals(sb2)); //여기서는 주소값으로 계산하기 때문에 false가 나옴
		
		//StringBuffer의 내용을 String으로 변환한다.
		String s=sb.toString();
		String s2=sb2.toString();
		
		
		System.out.println("s.equals(s2) ? "+s.equals(s2));
		//여기서는 문자열 자체를 비교하기 때문에 같다고 나온다 ^^;;
	}
}
