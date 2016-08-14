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
		//여기서 result[] =arr[] 이다.
	
	public static int[] fillRand(int[] arr,int[] data){
		for(int i=0; i< arr.length; i++){
			arr[i]=data[getRand(0,data.length-1)];
		}
		//배열 arr을 data[]에 있는 값들로 채워서 반환한다.
		//arr[i] 에 data[0~3중 랜덤] 값이 들어가는것.
		
		return arr;
	}
	public static int getRand(int start,int end){
		return (int)(Math.random()*(Math.abs(end-start)+1))+Math.min(start, end);
	}
	//메소드를 이러한 형태로 만드는것은 음수도 호환가능하게 하기 위해서이다.
	//start~end 범위의 정수값을 반환한다. 양끝 포함값이다. 즉, start<=x<=end 범위이다.
														     // 	0~3의 값이 나온다.
}

/*
10,7,8,5,8,6,9,5,7,5,
[7, 7, 2, 3, 3, 5, 2, 7, 2, 2]
 */

