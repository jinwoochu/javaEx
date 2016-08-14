package m8_d14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx3 {
	public static void main(String[] args){
		String source="HP:011-1111-1111, HOME:02-999-9999";
		String pattern ="(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(source);
		
		int i=0;
		while(m.find()){
			System.out.println(++i +": "+m.group()+"->"+m.group(1)+
								", "+m.group(2)+", "+m.group(3));			
		}
	}
		
	}

/*
���Խ��� �Ϻθ� ��ȣ�� ������ ��� �׷�ȭ(grouping)�� �� �ִ�.
�׷�ȭ�� �κ��� �ϳ��� ������ ���̴� ���� �Ǿ �� �� �Ǵ� �� �̻���
�ݺ��� �ǹ��ϴ� '+'�� '*'�� �ڿ� ���� �׷�ȭ�� �κ��� �������� �ȴ�.
�׸��� �׷�ȭ�� �κ��� group(int i)�� �̿��ؼ� ������ ���� �� �ִ�.

���� �������� (0\\d{1,2})-(\\d{3,4})-(\\d{4}) �� ��ȣ�� �̿��ؼ� ���Խ���
�� �κ����� �������µ� ������ ������� �� �� �ֵ��� ��Ī�Ǵ� ���ڿ�����
ù ��° �׷��� group(1)�� �� ��° �׷��� group(2)�� ���� ȣ�������ν� 
���� �� �ִ�. group() �Ǵ� group(0)�� �׷����� ��Ī�� ���ڿ� ��ü�� ������
���� ���� ä�� ��ȯ�Ѵ�.  

0\\d{1,2} ==> 0���� �����ϴ� �ּ� 2�ڸ� �ִ� 3�ڸ� ����(0����)
\\d{3,4} ==> �ּ�3�ڸ� �ִ� 4�ڸ��� ����
\\d{4} ==> 4�ڸ��� ����
*/
