package m8_d14;

import java.util.*;

public class RandomEx2 {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] number = new int[100];
		int[] counter = new int[10];

		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] = (int) (Math.random() * 10));
			// 0<=x<10 범위의 정수 x를 반환한다.
			System.out.print(number[i] = rand.nextInt(10));
		}
		System.out.println();
		
		for(int i=0; i<number.length;i++){
			counter[number[i]]++;
		}
		//이 부분에서 counter[]가 number[]에 저장된 값을 인덱스로 받아오므로
		//예를 들어 number[11]에 7이 들어있었다면 counter[7]의 값이 1 올라가는 코드이다.
		
		for(int i=0; i<counter.length;i++){
			System.out.println(i+"개수 :"+printGraph('#',counter[i])+""+counter[i]);
		}
		//그냥 나온숫자(counter[]에 저장된 값)만큼 #으로 찍어주는 메소드이다.
	}
	
	public static String printGraph(char ch, int value){
		char[] bar=new char[value];
		
		for(int i=0; i<bar.length;i++){
			bar[i]=ch;
		}
		return new String(bar);
	}
}
/*
3036875785934726318503684830722608462140219424800643788004074672360922135346790130843588794673716511
7275702369781813153497640657333184340320354992340140269675629547996614809618674788973332378223999484
0개수 :##########10
1개수 :########8
2개수 :########8
3개수 :############12
4개수 :############12
5개수 :#########9
6개수 :##############14
7개수 :###########11
8개수 :#########9
9개수 :#######7
*/

