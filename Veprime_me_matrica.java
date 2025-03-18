package jetaKrasniqi2;

public class Veprime_me_matrica {
	 public static int[][] matrica_e_transponuar(int[][] a) {
	        int rreshtat = a.length;
	        int kolonat = a[0].length;
	        int[][] matrica_e_transponuar = new int[kolonat][rreshtat];

	        for (int i = 0; i < rreshtat; i++) {
	            for (int j = 0; j < kolonat ; j++) {
	            	matrica_e_transponuar[j][i] = a[i][j];
	            }
	        }
	        return matrica_e_transponuar;
	    }
     
	 public static int[][] matrica_e_shumezuar(int[][] a , int[][] b) {
		 int[][] matrica_e_shumezuar = new int[a.length][b[0].length];
		 for(int i = 0; i<a.length; i++) {
	    	 for(int j =0; j<b[0].length; j++) {
	    	          for(int k = 0; k < b.length; k++) {
	    	        	  matrica_e_shumezuar[i][j] += a[i][k] * b[k][j];
	    	          }
		      }
	     }
		 return matrica_e_shumezuar; 
	 }
}

