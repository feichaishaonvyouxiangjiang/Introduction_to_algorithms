package bubblesort;
import java.util.*;
public class ma {
	public static void main(String args[]){
		System.out.println("qingshuru");
		Scanner in = new Scanner (System.in);
		char[] A = new char[100];
		String str = in.nextLine();
		A = str.toCharArray();
		bubble.bubb(A);
		System.out.println(A);
	}

}
