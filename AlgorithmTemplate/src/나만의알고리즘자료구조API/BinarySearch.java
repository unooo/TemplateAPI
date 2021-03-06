package 나만의알고리즘자료구조API;

import org.junit.Assert;
import org.junit.Test;


public class BinarySearch {
	
	@Test
	
	public void solutionTest(){
	int []ary;
	ary=new int[]{1,2,5,9,9};
	int target = 5;	
	Assert.assertEquals(2, lowerBound(ary, target));
	
	target = 9;	
	//Assert.assertEquals(3, lowerBound(ary, target));
	
	target=-10;
	//Assert.assertEquals(ary.length*-1, lowerBound(ary, target));
	
	}
	int lowerBound(int[] ary, int target){
		
		int N = ary.length;
		if(N==0)return -1;
		
		int left=-1;
		int right=N-1;
		while(left<right){
			int m = (left+right+1)/2;
			if(ary[m]>target){
				right=m-1;
			}else{
				left=m;
			}
		}		
		if(left>=0&&ary[left]==target)
			return left;
		
		return left*-1;
	}

}
