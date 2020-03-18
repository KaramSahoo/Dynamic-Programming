public class Fibonaci {
	static int getNthFiboNum(int N) {
		int Fibo[] = new int[N+1]; //to store the fibonaci numbers
		Fibo[0] = 0;
		Fibo[1] = 1;
		for (int i = 2; i <= N; i++) {
			Fibo[i] = Fibo[i-1] + Fibo[i-2];
		}
		return Fibo[N];
	}
	public static void main(String[] args) {
		int n = 7;
		System.out.println(getNthFiboNum(n));
	}
}
