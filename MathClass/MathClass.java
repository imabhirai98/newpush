package MathClass;
import java.lang.Math;



public class MathClass {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 6;
		int minValue = Math.min(num1, num2);
		int maxValue = Math.floorDiv(num2, num1);
		System.out.println(minValue);
		System.out.println(maxValue);

		
	}

}
