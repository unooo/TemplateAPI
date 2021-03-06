/*
 * #여러개의 구간합을 빠르게 계산할때 사용한다.
 * 1. 누적합을 이용한 prefixSumAry 를 만든다.
 * 2. left와 right를 포함한 구간합은  prefixSumAry[right+1]-prefixSumAry[left] 으로 구한다.
 * 
 */

package 나만의알고리즘자료구조API;

import org.junit.Assert;
import org.junit.Test;

public class 구간합_PrefixSum {
	
	@Test
	public void prefixSumTest(){
		int data[] = new int[]{8, 4, 6, 2, 1, 10, 6, 2, 2, 4};
		int[] prefixSumAry = new int[data.length+1];
		int tempSum=0;
		for(int i = 0 ; i <data.length;i++){
			tempSum+=data[i];
			prefixSumAry[i+1]=tempSum;
		}
		
		Assert.assertEquals(17, sum(4, 6, prefixSumAry));
		
		
	}
	
	
	public static int sum(int left, int right,int[] prefixSumAry){
		int ret=0;		
		return prefixSumAry[right+1]-prefixSumAry[left];		
	}

}
