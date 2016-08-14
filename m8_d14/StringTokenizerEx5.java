package m8_d14;

import java.util.StringTokenizer;

public class StringTokenizerEx5 {
	public static void main(String[] args){
		String data="100,,,200,300";
		
		String[] result=data.split(",");
		StringTokenizer st=new StringTokenizer(data,",");
		
		for(int i=0; i<result.length;i++){
			System.out.print(result[i]+"|");
		}
		System.out.println("����:"+result.length);
		
		int i=0;
		
		for(;st.hasMoreTokens();i++)
			System.out.print(st.nextToken()+"|");
		
		System.out.println("����:"+i);
		
		
	}
}

/*
�����ڸ� ','�� �ϴ� ���ڿ� �����͸� StringŬ������ split()�� String
Tokenizer�� �߶� �� ����� ���ϴ� �����̴�. �������� ����, split()��
�� ���ڿ��� ��ū���� �ν��ϴ� �ݸ� StringTokenizer�� �� ���ڿ��� ��ū����
�ν����� �ʱ� ������ �ν��ϴ� ��ū�� ������ ���� �ٸ� ���� �� �� �ִ�.
�� �ܿ��� ������ ���̰� �ִµ�, split()�� �����͸� ��ū���� �߶� �����
�迭�� ��Ƽ� ��ȯ�ϱ� ������ �����͸� ��ū���� �ٷιٷ� �߶� ��ȯ�ϴ�
StringTokenizer���� ������ ������ �� �ۿ� ����. �׷��� �������� ���� ����
��찡 �ƴ϶�� �� ������ ���� �����Ƿ� ũ�� �Ű澲�� �ʾƵ� �ȴ�.
*/
