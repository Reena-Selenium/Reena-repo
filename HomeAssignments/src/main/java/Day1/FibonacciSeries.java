package Day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6;
		int n1=0;
		int n2=1;
		int n3;
		System.out.println(n1);
		System.out.println(n2);
		for (int i = 0; i <num; i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
		}
	}
}

	


