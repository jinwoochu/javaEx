package m8_d14;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {
	public static void main(String[] args){
		String source="100,200,300,400";
		StringTokenizer st=new StringTokenizer(source, ",");
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
}

/*
StringTokenizer�� �� ���ڿ��� ������ ������(delimiter)�� �������� ��ū(token)�̶��
���� ���� ���ڿ��� �߶󳻴� �� ���ȴ�. ���� ��� "100,200,300,400"�̶�� ���ڿ���
���� �� ','�� �����ڷ� �߶󳻸� "100","200","300","400"�̶�� 4���� ���ڿ�(��ū)�� 
���� �� �ִ�.
 StringTokenizer�� �̿��ϴ� ��� �̿ܿ��� �Ʒ��� ���� String�� split(String regex)
 �̳� Scanner�� useDelimiter(String pattern)�� ����� ���� ������
 
	String[] result="100,200,300,400".split(",");
	Scanner sc2=new Scanner("100,200,300,400").useDelimiter(",");
	
�� �ΰ��� ����� ���Խ�ǥ��(regular expression)�� ����ؾ��ϹǷ� ���Խ� ǥ����
�ͼ����� ���� ��� StringTokenizer�� ����ϴ� ���� �����ϸ鼭�� ��Ȯ�� ����� 
���� �� ���� ���̴�.
 �׷��� StringTokenizer�� �����ڷ� �� �ϳ��� ���� �ۿ� ������� ���ϱ� ������
 ���� ������ ������ �����ڷ� ���ڿ��� ������� �� ���� ��¿ �� ���� ���Խ��� 
 ����ϴ� �޼��带 ����ؾ� �� ���̴�.
 
 StringTokenizer�� �����ڿ� �޼���
 StringTokenizer�� �ַ� ���Ǵ� �����ڿ� �޼���� ������ ����.
 
 ������/�޼���                                  ����
 StringTokenizer(String str, String delim)		���ڿ�(str)�� ������ ������(delim)�� ������ StringTokenizer��
 												�����Ѵ�.(�����ڴ� ��ū���� ���ֵ��� ����)

StringTokenizer(String str, String delim,		���ڿ�(str)�� ������ ������(delim)�� ������ StringTokenizer��
 				boolean returnDelims)			�����Ѵ�. returnDelims�� ���� true�� �ϸ� �����ڵ� ��ū���� 
 												���ֵȴ�.
 										
int countTokens()								��ü ��ū�� ���� ��ȯ�Ѵ�.

boolean hasMoreTokens()							��ū�� �����ִ��� �˷��ش�.

String nextToken()								���� ��ū�� ��ȯ�Ѵ�.
 

*/