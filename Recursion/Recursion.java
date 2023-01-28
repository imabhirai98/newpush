package Recursion;

public class Recursion {
	public static int addNum(int i){
		if(i>0) {
			return i+addNum(i-1);}
		else
			return 0;
		}
		
		
	public static void main(String[] args) {
		System.out.println(addNum(10));
		

	}

}
