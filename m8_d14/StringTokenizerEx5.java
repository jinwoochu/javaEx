package m8_d14;

import java.util.StringTokenizer;

public class StringTokenizerEx5 {
	public static void main(String[] args){
		String data="100,,,200,300";
		
		String[] result=data.split(",");
		StringTokenizer st=new StringTokenizer(data,",");
		
		for(int i=0; i<result.length;i++){
			System.out.print(result[i]+"|");
		}
		System.out.println("개수:"+result.length);
		
		int i=0;
		
		for(;st.hasMoreTokens();i++)
			System.out.print(st.nextToken()+"|");
		
		System.out.println("개수:"+i);
		
		
	}
}

/*
구분자를 ','로 하는 문자열 데이터를 String클래스의 split()과 String
Tokenizer로 잘라 낸 결과를 비교하는 예제이다. 실행결과를 보면, split()은
빈 문자열도 토큰으로 인식하는 반면 StringTokenizer는 빈 문자열을 토큰으로
인식하지 않기 때문에 인식하는 토큰의 개수가 서로 다른 것을 알 수 있다.
이 외에도 성능의 차이가 있는데, split()은 데이터를 토큰으로 잘라낸 결과를
배열에 담아서 반환하기 때문에 데이터를 토큰으로 바로바로 잘라서 반환하는
StringTokenizer보다 성능이 떨어질 수 밖에 없다. 그러나 데이터의 양이 많은
경우가 아니라면 별 문제가 되지 않으므로 크게 신경쓰지 않아도 된다.
*/
