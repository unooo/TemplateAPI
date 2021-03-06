package 나만의알고리즘자료구조API;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args){
		int ary[] = new int[]{10,2,3,1,5,4,9,20};
		TreeSet<Integer> set= new TreeSet<Integer>();
		for(int tp : ary){
			set.add(tp);
		}
		System.out.println();
	}
}
