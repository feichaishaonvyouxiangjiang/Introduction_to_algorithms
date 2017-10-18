import java.util.Scanner;
public class insert {
	public static void main(String args[]){
		System.out.println("ÇëÊäÈëÒªÅÅĞòµÄ×Ö·û´®");
		Scanner scan = new Scanner(System.in);
		String Data = scan.nextLine();
		int L = Data.length();
		char ARR[] = new char[100];
		ARR = Data.toCharArray();
	    for (int j=1; j < L; j++){
	    	char key;
	    	key = ARR[j];
	    	int i = j;
	    	while (key < ARR[i-1] && i>0){
	    		ARR[i]=ARR[i-1];
	    		--i;
	    	}
	        ARR[i] = key;
	    }
	    System.out.println(ARR);
	    return; 	
	}

}
