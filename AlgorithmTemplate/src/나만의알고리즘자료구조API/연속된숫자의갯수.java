package 나만의알고리즘자료구조API;
import java.util.Comparator;
import java.util.Stack;
import java.util.TreeSet;

import org.junit.Assert;
import org.junit.Test;

public class 연속된숫자의갯수 {
	
	
	@Test
	public void Type1Test(){
		int[] array = new int[]{0,0,0,1,1,0,1,1,1,0,1,1,0,1,1,1,1,1};
		Assert.assertEquals(5, type1(array));
	}
	
	public static int type1(int[] array){		
		
		
		TreeSet<Integer> set = new TreeSet<Integer>(Comparator.reverseOrder());		
		Stack<Integer> stack = new Stack<Integer>();		
		for(int temp : array){
			if(stack.isEmpty()){
				stack.push(temp);
				continue;
			}
			if(temp==stack.peek()){
				stack.push(temp);
			}else{
				if(temp==0){
					set.add(stack.size());
					stack.clear();
				}else{
					stack.clear();
					stack.push(temp);
				}
			}
		}
		
		if(stack.peek()==1)
			set.add(stack.size());
		
		return set.first();
		
	}

}
