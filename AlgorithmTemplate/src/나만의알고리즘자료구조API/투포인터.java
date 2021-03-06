/*
 * #수열에서 특정한 합을 가지는 부분 연속 수열을 찾을 때 사용한다.
 * N^2의 시간복잡도를 N으로 줄일 수 있다
 * 1. 투 포인터(start, end)를 시작점에 동시에 위치시킨다.
 * 2. 
 * case 1)start end를 포함하지 않는 구간의 합이 M 보다 크다면 start를 증가시켜 구간합을 감소시켜 M에 가깝게한다
 * case 2)반대로 "구간의 합"이 M보다 작다면 end를 증가시켜 구간합을 증가시켜 M에 가깝게 한다.
 * case 3) 구간의 합이  M과 같다면 count를 증가시키고 end를 증가시킨다.
 * 
 * 정리)
 * 
(현재 부분 합 == M) --> count += 1 and end+=1
(현재 부분 합 <= M) --> end += 1
(현재 부분 합 > M) --> start += 1
 * 
 */

package 나만의알고리즘자료구조API;

import org.junit.Assert;
import org.junit.Test;

public class 투포인터 {
	
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

			// end값을 가능한 만큼 증가시킨 다음
			while (partial_sum < target && end < ary.length) {
				partial_sum += ary[end];
				end += 1;
			}
			
			// 부분 합이 m이라면 카운트를 증가시킨다.
			if (partial_sum == target) {
				count += 1;
			}
			
			// start값을 1 증가시키기 전에 해당 수열의 값을 빼준다.
			partial_sum -= ary[start];

		}
		return count;

	}

}
