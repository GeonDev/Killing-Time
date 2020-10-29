package son.L1.GcdLcm;

public class GcdLcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	//최대 공약수
	public static int gcd(int a, int b) {
		int temp =1;
		
		while (temp > 0) {
			temp = a%b;
			a=b;
			b=temp;
		}
		
		return a;
	}
	
	//최소공배수
	public static int Lcm(int a, int b, int gcd) {
		
		return (a*b)/gcd;
	}

}
