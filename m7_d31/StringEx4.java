package m7_d31;

import java.util.StringJoiner;

public class StringEx4 {
	public static void main(String[] args){
		String animals = "dog,cat,bear";
		System.out.println(animals);
		String[] arr = animals.split(",");
		for(String s : arr)
			System.out.println(s);
		System.out.println(String.join("-", arr));
		
		StringJoiner sj= new StringJoiner("/","(",")");
		for(String s : arr)
			sj.add(s);
		System.out.println(sj.toString());
	}
}
//split은 그냥 문자열을 특정한 문자를 기준으로 나누어서 새로운 문자열 배열에다가 넣는것이다.
//그리고 join은 원래있던 문자열을 특정한 문자열을 중간에 끼워서 모두 더하는것이다.
//StringJoiner 클래스의 생성자는 첫번째 아규먼트로 중간에 삽입할 문자, 두번째 세번째는 처음과 끝을 장식할 문자가 들어가는것이다.
//그리고 StringJoiner 클래스의 add메소드를 통해 특정한 문자열을 그 틀 안에다가 삽입하는것임.

//String클래스의 여러 메소드의 아규먼트가 int ch로 규정되어있는것은 유니코드가 원래 2바이트(16비트)체계인데 이것으로 모자라서 20비트로 확장하게되었다.
//그래서 하나의 문자를 char타입으로 다루지 못하고, int타입으로 다룰수 밖에 없다. 확장에 의해 새로 추가된 문자들은 "보충 문자"라고 하는데 보충 문자를 사용할
