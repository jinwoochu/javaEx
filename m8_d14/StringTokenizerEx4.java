package m8_d14;

import java.util.StringTokenizer;

public class StringTokenizerEx4 {
	public static void main(String[] args){
		String input="��õ����õ������";
		
		System.out.println(input);
		System.out.println(hangulToNum(input));
	}
	public static long hangulToNum(String input){
		long result=0;
		long tmpResult=0;
		long num=0;
		
		final String NUMBER="�����̻�����ĥ�ȱ�";
		final String UNIT="�ʹ�õ������";
		final long[] UNIT_NUM={10,100,1000,10000,(long)1e8,(long)1e12};
		
		StringTokenizer st=new StringTokenizer(input,UNIT,true);
		
		while(st.hasMoreTokens()){
			String token=st.nextToken();
			//��������, ����(UNIT)���� Ȯ���Ѵ�.
			int check=NUMBER.indexOf(token);
			
			if(check==-1){	//������ ���
				if("������".indexOf(token)==-1){
					tmpResult+=(num!=0 ? num:1)
							*UNIT_NUM[UNIT.indexOf(token)];
				}else{
					tmpResult+=num;
					result+=(tmpResult!=0 ? tmpResult:1)
							*UNIT_NUM[UNIT.indexOf(token)];
					tmpResult=0;
				}
				num=0;
			}else{		//������ ���
				num=check;
			}
		}
		return result+tmpResult+num;
	}
}
/*
�ѱ۷� �� ���ڸ� �ƶ��� ���ڷ� ��ȯ�ϴ� �����̴�.
���� tmpResult�� "������"�� ���� ū ������ ������ ������ "�ʹ�õ"������
���� �����ϱ� ���� �ӽð����̰� result�� ���� ��� ���� �����ϱ� ���� �����̴�
�ѱ۷� �� ���ڸ� ������(����)�� �߶�, ��ū�� ���ڸ� num�� �����ϰ� ������
num�� ����(UNIT_NUM�迭 ���� �� ��)�� ���ؼ�tmpResult�� �����Ѵ�. ���� ���
"���"�̸� 3*10�� �Ǿ� 30�� tmpResult�� ����ȴ�.
�׸��� "����õ"�� ���� ���� ���� �ٷ� ������ �����ϴ� ��쿡�� num�� ����
0�̱� ������ ������ ���� ���ص� �� ����� 0�� �ǹǷ� ���� �����ڸ� �̿�
�ؼ� num�� ���� 1�� �ٲ� �� �������� ���ϵ��� �Ͽ���.

�� ������ "������"�� ���� ū ������ ������ tmpResult�� ����� ���� ū ����
���� ���ؼ� result�� �����ϰ� tmpResult�� 0���� �ʱ�ȭ �Ѵ�. ���� ���
"��ʸ�"�� tmpResult�� ����Ǿ� �ִ� 30�� 10000�� ���ؼ� result�� �����ϰ�
tmpResult�� 0���� �ʱ�ȭ�Ѵ�.
*/
