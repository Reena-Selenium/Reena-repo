package Day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=353;
		int reverse=0;		
		int temp = num;
		while(temp>0) {
			int remainder=temp%10;
			reverse=(reverse*10)+remainder;
			temp=temp/10;
		}
		if(num==reverse)
			System.out.println("Palindrome");
		else
		System.out.println("Not a Palindrome");
	}
}
