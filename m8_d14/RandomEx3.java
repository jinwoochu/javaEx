package m8_d14;

import java.util.Arrays;

public class RandomEx3 {
	public static void main(String[] args){
		for(int i=0; i<10; i++){
			System.out.print(getRand(5,10)+",");
		}
		System.out.println();
		
		int[] result=fillRand(new int[10],new int[]{2,3,7,5});
			System.out.println(Arrays.toString(result));
		}
		//���⼭ result[] =arr[] �̴�.
	
	public static int[] fillRand(int[] arr,int[] data){
		for(int i=0; i< arr.length; i++){
			arr[i]=data[getRand(0,data.length-1)];
		}
		//�迭 arr�� data[]�� �ִ� ����� ä���� ��ȯ�Ѵ�.
		//arr[i] �� data[0~3�� ����] ���� ���°�.
		
		return arr;
	}
	public static int getRand(int start,int end){
		return (int)(Math.random()*(Math.abs(end-start)+1))+Math.min(start, end);
	}
	//�޼ҵ带 �̷��� ���·� ����°��� ������ ȣȯ�����ϰ� �ϱ� ���ؼ��̴�.
	//start~end ������ �������� ��ȯ�Ѵ�. �糡 ���԰��̴�. ��, start<=x<=end �����̴�.
														     // 	0~3�� ���� ���´�.
}

/*
10,7,8,5,8,6,9,5,7,5,
[7, 7, 2, 3, 3, 5, 2, 7, 2, 2]
 */

