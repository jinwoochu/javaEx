package m8_d13;

public class WrapperEx1 {
	public static void main(String[] args){
		Integer i= new Integer(100);
		Integer i2= new Integer(100);
		
		System.out.println("i==i2 ? " +(i==i2));
		System.out.println("i.equals(i2) ? "+i.equals(i2));
		System.out.println("i.compareTo(i2) ? "+i.compareTo(i2));
		System.out.println("i.toString() = "+i.toString());
		System.out.println();
		System.out.println("Max_Value = "+Integer.MAX_VALUE);
		System.out.println("Min_Value = "+Integer.MIN_VALUE);
		System.out.println("Size = "+Integer.SIZE+"bits");
		System.out.println("Bytes = "+Integer.BYTES+"bytes");
		System.out.println("Type = "+Integer.TYPE);
		
	}
}

