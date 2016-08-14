package m8_d14;

import java.util.StringTokenizer;

public class StringTokenizerEx3 {
	public static void main(String[] args){
		String source=
				"1,김천재,100,100,100|2,박수재,95,80,90|3,이자바,80,90,90";
		StringTokenizer st= new StringTokenizer(source,"|");
		
		while(st.hasMoreTokens()){
			String token=st.nextToken();
			
			StringTokenizer st2=new StringTokenizer(token, ",");
			while(st2.hasMoreTokens()){
				System.out.println(st2.nextToken());
			}
			System.out.println("------");
		}
	}
}

/*
문자열에 포함된 데이터가 두가지 종류의 구분자로 나뉘어져 있을 때 두 개의
StringTokenizer와 이중 반복문을 사용해서 처리하는 방법을 보여주는 예제이다.
한 학생의 정보를 구분하기 위해 "|"를 사용하였고 학생의 이름과 점수 등을 구분
하기 위해 ","를 사용하였다.
*/

