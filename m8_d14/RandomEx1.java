package m8_d14;

import java.util.Random;

public class RandomEx1 {
	public static void main(String[] args){
		Random rand = new Random(1); // Random�� ���� �Ű����� ��,seed���� ���� ���̹Ƿ�
									 // �Ѵ� ���� ���� �����°��̴�.
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

//���⼭ �ٸ����� ������ �ҷ��� seed���� �ٸ��� �־�ߵǴµ�, �Ű������� System.currentTimeMillis()��
//�־��ְ� �Ǹ� ���� �ð��� 1/1000�� ������ ��Ÿ���ֱ� ������ seed���� �ߺ��� ���� ���� �ȴ�.