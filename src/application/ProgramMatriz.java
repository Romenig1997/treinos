package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMatriz {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][]  mat = new int[m][n];
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j <mat[i].length; j++) {
				mat[i][j]= sc.nextInt();
			}
		}
		
		for(int i=0; i<m; i++) {
			System.out.println();
			for(int j=0; j<n; j++) {
				System.out.print(mat[i][j] + " ");
			}
		}
		
		System.out.println();
		System.out.println("Enter the value to be tested: ");
		int valor = sc.nextInt();
		//percorre e faz a leitura da matriz bidimensional
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j< mat[i].length; j++) {
				if(mat[i][j] == valor) {
					System.out.println("Position:" + i + "," + j );	
				if(j > 0) {
					System.out.println("Left: " + mat[i][j-1]);
				}
				if(j < n - 1) {
					System.out.println("Right: " + mat[i][j+1]);
				}
				if(i > 0) {
					System.out.println("Up: " + mat[i-1][j]);
				}
				if(i < m - 1) {
					System.out.println("Down: " + mat[i+1][j]);
				}
					}
				
			}
		}

		
		
		sc.close();

	}

}
