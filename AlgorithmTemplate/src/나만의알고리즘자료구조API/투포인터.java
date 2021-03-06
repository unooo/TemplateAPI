/*
 * #�������� Ư���� ���� ������ �κ� ���� ������ ã�� �� ����Ѵ�.
 * N^2�� �ð����⵵�� N���� ���� �� �ִ�
 * 1. �� ������(start, end)�� �������� ���ÿ� ��ġ��Ų��.
 * 2. 
 * case 1)start end�� �������� �ʴ� ������ ���� M ���� ũ�ٸ� start�� �������� �������� ���ҽ��� M�� �������Ѵ�
 * case 2)�ݴ�� "������ ��"�� M���� �۴ٸ� end�� �������� �������� �������� M�� ������ �Ѵ�.
 * case 3) ������ ����  M�� ���ٸ� count�� ������Ű�� end�� ������Ų��.
 * 
 * ����)
 * 
(���� �κ� �� == M) --> count += 1 and end+=1
(���� �κ� �� <= M) --> end += 1
(���� �κ� �� > M) --> start += 1
 * 
 */

package �����Ǿ˰����ڷᱸ��API;

import org.junit.Assert;
import org.junit.Test;

public class �������� {
	
	@Test
	public void calcTest(){
		int ary[] = {8, 4, 6, 2, 1, 10, 6, 2, 2, 4};
		int target = 8;
		Assert.assertEquals(4, calc(ary, target));
	}

	public static int calc(int[] ary, int target) {

		int count = 0;
		int partial_sum = 0;
		int end = 0;

		for (int start = 0; start < ary.length; start++) {

			// end���� ������ ��ŭ ������Ų ����
			while (partial_sum < target && end < ary.length) {
				partial_sum += ary[end];
				end += 1;
			}
			
			// �κ� ���� m�̶�� ī��Ʈ�� ������Ų��.
			if (partial_sum == target) {
				count += 1;
			}
			
			// start���� 1 ������Ű�� ���� �ش� ������ ���� ���ش�.
			partial_sum -= ary[start];

		}
		return count;

	}

}
