/*
 * #�������� �������� ������ ����Ҷ� ����Ѵ�.
 * 1. �������� �̿��� prefixSumAry �� �����.
 * 2. left�� right�� ������ ��������  prefixSumAry[right+1]-prefixSumAry[left] ���� ���Ѵ�.
 * 
 */

package �����Ǿ˰����ڷᱸ��API;

import org.junit.Assert;
import org.junit.Test;

public class ������_PrefixSum {
	
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
