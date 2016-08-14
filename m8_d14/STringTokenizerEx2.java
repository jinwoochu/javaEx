package m8_d14;

import java.util.StringTokenizer;

public class STringTokenizerEx2 {
	public static void main(String[] args){
		String expression = "x=100*(200*300)/2";
		StringTokenizer st=
				new StringTokenizer(expression, "+-/*=()",true);
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}		
	}
}
/*
 *������ StringTokenizer(STring str, String delim, boolean returnDelims)�� ����ؼ�
 * �����ڵ� ��ū���� ���ֵǵ��� �Ͽ���.
 *�׸��� �����ڷ� ���� ���ڵ��� ������ ���� �����ܺ���. �ռ� ���Ͱ� ����
 *StringTokenizer�� �� �� ������ �����ڸ� ����� �� �ֱ� ������
 *"+-/*()" ��ü�� �ϳ��� �����ڰ� �ƴ϶� ������ ���ڰ� ��� �����ڶ�� �Ϳ�
 *�����ؾ� �Ѵ�.
 *
 *�׷��� ����� �ϸ� �̿� ���� �����ڵ��� �ϳ��� ���� ��µǰ� �Ǵ°��̴�.
 *
x
=
100
*
(
200
*
300
)
/
2

*/