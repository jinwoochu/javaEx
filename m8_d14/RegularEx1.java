package m8_d14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx1 {
	public static void main(String[] args){
		String[] data = {"bat", "baby", "bonus", "cA", "ca", "co",  "c.", "c0"
						, "car", "combat", "count", "date", "disc"};
		
		Pattern p = Pattern.compile("c[a-z]*"); //c�� �����ϴ� �ҹ��ڿ��ܾ�
		
		for(int i=0; i<data.length;i++){
			Matcher m = p.matcher(data[i]);
			if(m.matches())
				System.out.print(data[i]+",");
		}
	}
}



/*
 * data��� ���ڿ��迭�� ��� ���ڿ� �߿��� ������ ���Խİ� ��ġ�ϴ� ���ڿ��� ����ϴ�
 * �����̴�. Pattern�� ���Խ��� �����ϴµ� ���ǰ� Matcher�� ���Խ�(����)�� �����Ϳ�
 * ���ϴ� ������ �Ѵ�. ���Խ��� �����ϰ� �����͸� ���ϴ� ������ �ܰ躰�� �����ϸ�
 * ������ ����
 * 
 * 1.���Խ��� �Ű������� PatternŬ������ static�޼����� Pattern compile(String regex)��
 * ȣ���Ͽ� Pattern�ν��Ͻ��� ��´�.
 *  < Pattern p = Pattern.compile("c[a-z]*"); >
 *  
 * 2.���Խ����� ���� ����� �Ű������� PatternŬ������ matcher(CharSequence input)��
 * ȣ���ؼ� Matcher�ν��Ͻ��� ��´�. 
 * < Matcher m = p.matcher(data[i]); >
 * 
 * 3.Matcher�ν��Ͻ��� boolean matches()�� ȣ���ؼ� ���ԽĿ� �����ϴ��� Ȯ���Ѵ�.
 * < if(m.matches()) > 
 * if�� �������� �� ������ �����ϸ� ���� �������� ������ �ǰڴ�. 
 * ���� ����� ��Ű�� ������?? ���� ����ó��.
 
 
  ca,co,car,combat,count,
  
  
 ���⼭ CharSequence�� interface�̴�. �̰��� ������ Ŭ������ CharBuffer,String,StringBuffer�� �ִ�.
 */

