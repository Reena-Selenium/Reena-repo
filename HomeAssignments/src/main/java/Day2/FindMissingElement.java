package Day2;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []num= {1,4,3,2,8,6,7};
		int n=num.length+1;
		int sum=0;
		int totalsum=(n*(n+1))/2;
		for (int i = 0; i < num.length; i++) {
			sum=sum+num[i];
		}
			int missingnumber=totalsum-sum;
			System.out.println(missingnumber);
	}
}
