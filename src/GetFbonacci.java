public class GetFbonacci {
	
	public static void main(String[] args) {
		GetFbonacci fbonacci = new GetFbonacci();
		fbonacci.getFibonacci(25);
	}
	
	public int getFibonacci(int n){
		int f=0,s=1,t=0;
		for (int i = 0; i < n; i++) {
			f=s;
			s=t;
			t = f+s;
			System.out.print(t+" ");
		}
		return t;
	}

}
