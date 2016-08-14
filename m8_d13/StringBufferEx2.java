package m8_d13;

public class StringBufferEx2 {
	public static void main(String[] args){
		StringBuffer sb= new StringBuffer("01");
		StringBuffer sb2= sb.append(23);
		sb.append('4').append(56);
		
		StringBuffer sb3= sb.append(78);
		sb3.append(9.0);
		
		//������ ���� ���� ����Ű�°��� ������ ���̹Ƿ� �� ���� ���� ������ �ȴ�.
		System.out.println("sb = "+sb);
		System.out.println("sb2 = "+sb2);
		System.out.println("sb3 = "+sb3);
		
		System.out.println("sb10 = "+sb.deleteCharAt(10)); //���������� ���� �ϳ��� ����
		//���⼭�� .�� ��������
		System.out.println("sb11 = "+sb.delete(3,6));  // ������ ���� ���� �ִ� ���ڿ� ����
		//3,4,5 �� �������� �������κ��� ��ĭ ������´�.
		System.out.println("sb12 = "+sb.insert(3, "abc")); //������ ��ġ(index)�� ���ο� ���ڿ� �߰�.
		//3��° ĭ���� a�� ���۵�.
		System.out.println("sb13 = "+sb.replace(6, sb.length(), "END"));
		//6~������ĭ�� �ִ� ���ڸ� END�� ��ü�ع���. ���ڿ������� ���̳��� ������� �����.
		
		System.out.println("capacity = "+sb.capacity()); //������ü�� ũ��
		System.out.println("length = "+sb.length()); //	����� ���ڿ��� ũ��.
		
	}
}
