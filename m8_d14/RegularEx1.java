package m8_d14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx1 {
	public static void main(String[] args){
		String[] data = {"bat", "baby", "bonus", "cA", "ca", "co",  "c.", "c0"
						, "car", "combat", "count", "date", "disc"};
		
		Pattern p = Pattern.compile("c[a-z]*"); //c로 시작하는 소문자영단어
		
		for(int i=0; i<data.length;i++){
			Matcher m = p.matcher(data[i]);
			if(m.matches())
				System.out.print(data[i]+",");
		}
	}
}



/*
 * data라는 문자열배열에 담긴 문자열 중에서 지정한 정규식과 일치하는 문자열을 출력하는
 * 예제이다. Pattern은 정규식을 정의하는데 사용되고 Matcher는 정규식(패턴)을 데이터와
 * 비교하는 역할을 한다. 정규식을 정의하고 데이터를 비교하는 과정을 단계별로 설명하면
 * 다음과 같다
 * 
 * 1.정규식을 매개변수로 Pattern클래스의 static메서드인 Pattern compile(String regex)을
 * 호출하여 Pattern인스턴스를 얻는다.
 *  < Pattern p = Pattern.compile("c[a-z]*"); >
 *  
 * 2.정규식으로 비교할 대상을 매개변수로 Pattern클래스의 matcher(CharSequence input)을
 * 호출해서 Matcher인스턴스를 얻는다. 
 * < Matcher m = p.matcher(data[i]); >
 * 
 * 3.Matcher인스턴스에 boolean matches()를 호출해서 정규식에 부합하는지 확인한다.
 * < if(m.matches()) > 
 * if문 다음에는 이 조건이 부합하면 나올 로직들이 들어오면 되겠다. 
 * 보통 출력을 시키지 않을까?? 위의 예제처럼.
 
 
  ca,co,car,combat,count,
  
  
 여기서 CharSequence는 interface이다. 이것을 구현한 클래스는 CharBuffer,String,StringBuffer가 있다.
 */

