package bubblesort;

public class bubble {
	public static char[] bubb(char[] A){
		int L = A.length;
		for (int i = 0;i < L;i++){
			for(int j = L-1;j > i;--j){
				if (A[j - 1] > A[j]){
					char a = A[j-1];
					A[j - 1] = A[j];
					A[j] = a;
				}
			}
			
		}
		return A;
	}
		 
	

}
