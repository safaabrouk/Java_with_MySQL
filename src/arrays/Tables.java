package arrays;

import java.util.Iterator;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" **** Table 1D **** ");
		// Table 1:
		int[] x = new int[3];
		x[0] = 1;
		x[1] = 2;
		x[2] = 3;
		System.out.print(x[0]+" "+x[1]+" "+x[2]);
		System.out.print("\n");
		
		
		// Table 2:
		int[] y = {11,22,33};
		for (int i = 0; i < y.length; i++) {
			System.out.print(y[i]+" ");
		}
		System.out.print("\n");
		
		// Table 3:
		int[] z = new int[]{111,222,333};
		for (int element : z) {
			System.out.print(element+" ");
		}
		System.out.print("\n\n");
		
		
		
		System.out.println(" **** Table 2D **** ");
		// Table 1:
		int[][] a = new int[2][2];
		a[0][0] = 1;
		a[0][1] = 2;
		a[1][0] = 3;
		a[1][1] = 4;
		System.out.print(a[0][0]+" "+a[0][1]+" "+a[1][0]+" "+a[1][1]);
		System.out.print("\n\n");
		
		
		// Table 2:
		int[][] b = {
				{1,2,3},{11,22}
				};
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		
		// Table 3:
		int[][] c = new int[][]{{111,222,333} , {1111,2222}};
		for (int[] element1 : c) {
			for (int element2 : element1) {
				System.out.print(element2+" ");
			}
			System.out.print("\n");
		}
		
		
	}

}
