package m8_d14;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {
	public static void main(String[] args){
		String source="100,200,300,400";
		StringTokenizer st=new StringTokenizer(source, ",");
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
}

/*
StringTokenizer는 긴 문자열을 지정된 구분자(delimiter)를 기준으로 토큰(token)이라는
여러 개의 문자열로 잘라내는 데 사용된다. 예를 들어 "100,200,300,400"이라는 문자열이
있을 때 ','를 구분자로 잘라내면 "100","200","300","400"이라는 4개의 문자열(토큰)을 
얻을 수 있다.
 StringTokenizer를 이용하는 방법 이외에도 아래와 같이 String의 split(String regex)
 이나 Scanner의 useDelimiter(String pattern)을 사용할 수도 있지만
 
	String[] result="100,200,300,400".split(",");
	Scanner sc2=new Scanner("100,200,300,400").useDelimiter(",");
	
이 두가지 방법은 정규식표현(regular expression)을 사용해야하므로 정규식 표현에
익숙하지 않은 경우 StringTokenizer를 사용하는 것이 간단하면서도 명확한 결과를 
얻을 수 있을 것이다.
 그러나 StringTokenizer는 구분자로 단 하나의 문자 밖에 사용하지 못하기 때문에
 보다 복잡한 형태의 구분자로 문자열을 나누어야 할 때는 어쩔 수 없이 정규식을 
 사용하는 메서드를 사용해야 할 것이다.
 
 StringTokenizer의 생성자와 메서드
 StringTokenizer의 주로 사용되는 생성자와 메서드는 다음과 같다.
 
 생성자/메서드                                  설명
 StringTokenizer(String str, String delim)		문자열(str)을 지정된 구분자(delim)로 나누는 StringTokenizer를
 												생성한다.(구분자는 토큰으로 간주되지 않음)

StringTokenizer(String str, String delim,		문자열(str)을 지정된 구분자(delim)로 나누는 StringTokenizer를
 				boolean returnDelims)			생성한다. returnDelims의 값을 true로 하면 구분자도 토큰으로 
 												간주된다.
 										
int countTokens()								전체 토큰의 수를 반환한다.

boolean hasMoreTokens()							토큰이 남아있는지 알려준다.

String nextToken()								다음 토큰을 반환한다.
 

*/