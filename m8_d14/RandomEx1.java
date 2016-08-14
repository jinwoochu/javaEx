package m8_d14;

import java.util.Random;

public class RandomEx1 {
	public static void main(String[] args){
		Random rand = new Random(1); // Random에 들어가는 매개변수 즉,seed값이 같은 값이므로
									 // 둘다 같은 값이 나오는것이다.
		Random rand2 = new Random(1);
		
		System.out.println("= rand = ");
		for(int i=0; i<5; i++){
			System.out.println(i+":"+rand.nextInt());
		}
		System.out.println();
		System.out.println("= rand2 = ");
		for(int i=0;i<5; i++)
			System.out.println(i+":"+rand2.nextInt());
	}
}
/*
= rand = 
0:-1155869325
1:431529176
2:1761283695
3:1749940626
4:892128508

= rand2 = 
0:-1155869325
1:431529176
2:1761283695
3:1749940626
4:892128508
*/

//여기서 다른값이 나오게 할려면 seed값을 다르게 주어야되는데, 매개변수에 System.currentTimeMillis()를
//넣어주게 되면 현재 시간을 1/1000초 단위로 나타내주기 때문에 seed값이 중복될 일이 없게 된다.