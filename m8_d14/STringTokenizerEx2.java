package m8_d14;

import java.util.StringTokenizer;

public class STringTokenizerEx2 {
	public static void main(String[] args){
		String expression = "x=100*(200*300)/2";
		StringTokenizer st=
				new StringTokenizer(expression, "+-/*=()",true);
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}		
	}
}
/*
 *생성자 StringTokenizer(STring str, String delim, boolean returnDelims)를 사용해서
 * 구분자도 토큰으로 간주되도록 하였다.
 *그리고 구분자로 여러 문자들을 지정한 것을 눈여겨보자. 앞서 본것과 같이
 *StringTokenizer는 단 한 문자의 구분자만 사용할 수 있기 때문에
 *"+-/*()" 전체가 하나의 구분자가 아니라 각각의 문자가 모두 구분자라는 것에
 *주의해야 한다.
 *
 *그래서 출력을 하면 이와 같이 구분자들이 하나씩 전부 출력되게 되는것이다.
 *
x
=
100
*
(
200
*
300
)
/
2

*/