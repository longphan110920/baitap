  
package bai3;
import java.util.Scanner;
public class Bai3 {
	public static void main(String[] args) {
		int n;
		Scanner s= new Scanner(System.in);
		
		do {
			System.out.println("Nhap vao bac cua ma tran: ");
			n= s.nextInt();
		}while(n<0);
		
		int[][] A = new int[n][n];
		System.out.println("Nhap vao cac ptu cua ma tran A: ");
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("A[" + i + "][" + j + "]= ");
				A[i][j]= s.nextInt();
			}
		}
		
		System.out.println("Ma tran A: ");
		for(int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				System.out.print(A[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}
}
