package m8_d13;

public class StringBufferEx2 {
	public static void main(String[] args){
		StringBuffer sb= new StringBuffer("01");
		StringBuffer sb2= sb.append(23);
		sb.append('4').append(56);
		
		StringBuffer sb3= sb.append(78);
		sb3.append(9.0);
		
		//어차피 같은 곳을 가리키는것을 변경한 것이므로 다 같은 값이 나오게 된다.
		System.out.println("sb = "+sb);
		System.out.println("sb2 = "+sb2);
		System.out.println("sb3 = "+sb3);
		
		System.out.println("sb10 = "+sb.deleteCharAt(10)); //정해진범위 문자 하나만 제거
		//여기서는 .이 지워진듯
		System.out.println("sb11 = "+sb.delete(3,6));  // 지정된 범위 내에 있는 문자열 제거
		//3,4,5 가 지워졌음 마지막부분은 한칸 살려놓는다.
		System.out.println("sb12 = "+sb.insert(3, "abc")); //지정된 위치(index)에 새로운 문자열 추가.
		//3번째 칸부터 a가 시작됨.
		System.out.println("sb13 = "+sb.replace(6, sb.length(), "END"));
		//6~마지막칸에 있는 문자를 END로 교체해버림. 문자열갯수가 차이나도 상관없이 사라짐.
		
		System.out.println("capacity = "+sb.capacity()); //버퍼자체의 크기
		System.out.println("length = "+sb.length()); //	저장된 문자열의 크기.
		
	}
}
