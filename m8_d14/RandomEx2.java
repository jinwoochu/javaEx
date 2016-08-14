package m8_d14;

import java.util.*;

public class RandomEx2 {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] number = new int[100];
		int[] counter = new int[10];

		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] = (int) (Math.random() * 10));
			// 0<=x<10 ������ ���� x�� ��ȯ�Ѵ�.
			System.out.print(number[i] = rand.nextInt(10));
		}
		System.out.println();
		
		for(int i=0; i<number.length;i++){
			counter[number[i]]++;
		}
		//�� �κп��� counter[]�� number[]�� ����� ���� �ε����� �޾ƿ��Ƿ�
		//���� ��� number[11]�� 7�� ����־��ٸ� counter[7]�� ���� 1 �ö󰡴� �ڵ��̴�.
		
		for(int i=0; i<counter.length;i++){
			System.out.println(i+"���� :"+printGraph('#',counter[i])+""+counter[i]);
		}
		//�׳� ���¼���(counter[]�� ����� ��)��ŭ #���� ����ִ� �޼ҵ��̴�.
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
0���� :##########10
1���� :########8
2���� :########8
3���� :############12
4���� :############12
5���� :#########9
6���� :##############14
7���� :###########11
8���� :#########9
9���� :#######7
*/

