
public class Main {

	public static void main(String[] args) {
		MyInteger myint = new MyInteger(7);
		MyInteger myint2 = new MyInteger(2);
		
		System.out.println(myint.getValue());
		System.out.println(myint.isEven());
		System.out.println(myint.isOdd());
		System.out.println(myint.isPrime());
		
		System.out.println(MyInteger.isEven(2));
		System.out.println(MyInteger.isOdd(2));
		System.out.println(MyInteger.isPrime(2));
		
		System.out.println(MyInteger.isEven(myint2));
		System.out.println(MyInteger.isOdd(myint2));
		System.out.println(MyInteger.isPrime(myint2));
		
		System.out.println(myint.equals(2));
		System.out.println(myint.equals(7));
		System.out.println(myint.equals(myint2));
		System.out.println(myint.equals(myint));
		
		char[] charArr = {'1','2','3'};
		System.out.println(MyInteger.parseInt(charArr));
		System.out.println(MyInteger.parseInt("123"));

	}

	

public static class MyInteger {

	private int value;
	public MyInteger(int value) {
		this.value = value;
	}
	
	public int getValue(){
		return value;
	}
	
	public Boolean isEven() {
		return value%2==0;
	}
	
	public Boolean isOdd() {
		return value%2==1;
	}
	
	public Boolean isPrime() {
		if(value == 1 || value == 0 || value == -1) {
			return false;
		}
		for (int i=2;i<=Math.abs(value)/2;i++) {
			if(value%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static Boolean isEven(int value) {
		return value%2==0;
	}
	
	public static Boolean isOdd(int value) {
		return value%2==1;
	}
	
	public static Boolean isPrime(int value) {
		if(value == 1 || value == 0 || value == -1) {
			return false;
		}
		for (int i=2;i<=Math.abs(value)/2;i++) {
			if(value%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static Boolean isEven(MyInteger myInt) {
		return myInt.getValue()%2==0;
	}
	
	public static Boolean isOdd(MyInteger myInt) {
		return myInt.getValue()%2==1;
	}
	
	public static Boolean isPrime(MyInteger myInt) {
		if(myInt.getValue() == 1 || myInt.getValue() == 0 || myInt.getValue() == -1) {
			return false;
		}
		for (int i=2;i<=Math.abs(myInt.getValue())/2;i++) {
			if(myInt.getValue()%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public Boolean equals(int value) {
		return this.value == value;
	}
	
	public Boolean equals(MyInteger myInt) {
		return this.value == myInt.getValue();
	}
	
	public static int parseInt(char[] charArr) {
		String str = new String(charArr);
		return Integer.parseInt(str);
	}
	
	public static int parseInt(String str) {
		return Integer.parseInt(str);
	}
	
}

}

