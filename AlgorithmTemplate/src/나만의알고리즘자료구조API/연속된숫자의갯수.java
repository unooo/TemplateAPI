package 나만의알고리즘자료구조API;
import java.util.HashSet;
import java.util.Stack;

public class 연속된숫자의갯수 {
	
	public static void main(String[] args){
		
		int[] array = new int[]{0,0,0,1,1,0,1,1,1,0,1,1,0,1,1,1,1,1};
		
		HashSet<Integer> set = new HashSet<Integer>();		
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
		
		System.out.println();
		
	}

}
