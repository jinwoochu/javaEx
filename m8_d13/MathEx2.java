package m8_d13;

public class MathEx2 {
	public static void main(String[] args){
		int i=Integer.MIN_VALUE;
		
		System.out.println("i = "+i);
		System.out.println("-i = "+(-i)); //����� �ٲ������ ����� �ְ������ �Ѿ��
		//�����÷ο찡 �߻��Ѱ��̴�.
		
		try {
			System.out.printf("negateExact(%d)=%d\n", 10, Math.negateExact(10));
			//negateExact��  ��ȣ��ȯ �޼ҵ��̴�. 
			System.out.printf("negateExact(%d)=%d\n", -10, Math.negateExact(-10));
			
			System.out.printf("negateExact(%d)= %d\n", i, Math.negateExact(i));
			//�׷��� ���⼭ �����÷ο찡 �߻��ߴµ�, �̰��� try-catch�� ��Ƽ�
			//�����÷ο찡 �Ͼ�� long������ ����ȯ ���Ѽ� negate�� �����Ű�°��̴�.
			//�̷��ԵǸ� �����÷ο찡 �Ͼ�� ���� �ٲ�°��� �����Ҽ� �ִ�.
			//�׳� �����ڸ� ���ؼ� ���� �ٲپ��ٸ� ���ܰ� �߻������ʾƼ� �̷��� ���� ó����
			//�Ҽ������� Math.~~Exact()�� ����ϸ� ���ܰ� �߻��ǹǷ� ����� ����ó���� �Ҽ�
			//�ְ� �ȴ� ^^;;
		} catch (ArithmeticException e) {
			System.out.printf("negateExact(%d)=%d\n",(long)i,Math.negateExact((long)i));
		}
	}
}
