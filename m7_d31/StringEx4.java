package m7_d31;

import java.util.StringJoiner;

public class StringEx4 {
	public static void main(String[] args){
		String animals = "dog,cat,bear";
		System.out.println(animals);
		String[] arr = animals.split(",");
		for(String s : arr)
			System.out.println(s);
		System.out.println(String.join("-", arr));
		
		StringJoiner sj= new StringJoiner("/","(",")");
		for(String s : arr)
			sj.add(s);
		System.out.println(sj.toString());
	}
}
//split�� �׳� ���ڿ��� Ư���� ���ڸ� �������� ����� ���ο� ���ڿ� �迭���ٰ� �ִ°��̴�.
//�׸��� join�� �����ִ� ���ڿ��� Ư���� ���ڿ��� �߰��� ������ ��� ���ϴ°��̴�.
//StringJoiner Ŭ������ �����ڴ� ù��° �ƱԸ�Ʈ�� �߰��� ������ ����, �ι�° ����°�� ó���� ���� ����� ���ڰ� ���°��̴�.
//�׸��� StringJoiner Ŭ������ add�޼ҵ带 ���� Ư���� ���ڿ��� �� Ʋ �ȿ��ٰ� �����ϴ°���.

//StringŬ������ ���� �޼ҵ��� �ƱԸ�Ʈ�� int ch�� �����Ǿ��ִ°��� �����ڵ尡 ���� 2����Ʈ(16��Ʈ)ü���ε� �̰����� ���ڶ� 20��Ʈ�� Ȯ���ϰԵǾ���.
//�׷��� �ϳ��� ���ڸ� charŸ������ �ٷ��� ���ϰ�, intŸ������ �ٷ�� �ۿ� ����. Ȯ�忡 ���� ���� �߰��� ���ڵ��� "���� ����"��� �ϴµ� ���� ���ڸ� �����
