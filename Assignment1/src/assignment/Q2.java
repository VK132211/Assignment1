package assignment;

public class Q2 {
	public static void main(String args[]) {
//		1 1 1 1
//		2 2 2 2
//		3 3 3 3
//		4 4 4 4


		int n = 4;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(j!=n) {
				System.out.print(i + " ");
				}
				else
				{
					System.out.print(i);
				}
			}
			System.out.println();
		}
	}
}
