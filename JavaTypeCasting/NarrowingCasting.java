package JavaTypeCasting;

public class NarrowingCasting {
	public static void main(String[] args) {
		float floatNo = 23.56f;
		int intNo = (int)floatNo;  //Manually casting ->Double to int
		
		System.out.println("Flaot No: " + floatNo);  //Output: 23
		System.out.println("Int No: " + intNo);      //Output: 23

	}

}
