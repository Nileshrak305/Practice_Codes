package com.psl.controlFlow;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		int[][] array = new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				array[i][j]= sc.nextInt();
			}
		}
		int x = sc.nextInt();
		
//		System.out.println("Your Matrix Output:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(array[i][j]==x) {
					System.out.print(array[i][j]+" Element found on Index "+"("+i+","+j+")");
				}
				
			}
			
	}

}
}
