package 나만의알고리즘자료구조API;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ListAndArray {
	
	public static void main(String[] args){
		
		
		//1. 컬렉션리스트를 객체배열로
		
		List<Integer> list = new LinkedList<Integer>();
		for(int i = 0 ; i < 10 ; i ++)
			list.add(i);
		Integer[] array = list.toArray(new Integer[list.size()]);
		
		
		//2. 객체배열을 컬렉션리스트로
		list = Arrays.asList(array); //ArrayList 이지만 원소 추가삭제 불가능.
		list = new ArrayList<Integer>(Arrays.<Integer>asList(array));// 원소 추가삭제가능
		
		//=====================================================//
		
		//원시형 배열을 객체형 배열로
		int[] a = new int[] {1,2,3,4};
		 
		//#1.int[] - > Integer[]
		Integer[] conv = Arrays.stream(a).boxed().toArray(Integer[]::new);
		 
		//#2.Integer[]  -> int[]
		a = Arrays.stream(conv).mapToInt(Integer::intValue).toArray();
		//=====================================================//
		
		//컬렉션리스트를 원시형배열로
		
		//ret.stream().mapToInt(Integer::intValue).toArray(); 
		
		//=====================================================//
		
		//3. String to Char[]
		
		char charAry[] = new String("ABCD").toCharArray();
		System.out.println(charAry);
		
		//=====================================================//
		
		//4 Char[] to String
		charAry[0]='K';		
		String str = new String(charAry);
		System.out.println(str);
		
		//=====================================================//
		
		//5. 한바퀴 이상 돌리기
		int startIdx=4; // 회전 시작점
		int endIdx=8; // 회전 종료점
		int spinNum=3; //회전횟수
		for(int i = 0 ; i < spinNum; i ++){ // 세바퀴 돌리기
			int temp=list.remove(startIdx);
			list.add(endIdx,temp);
		}
		list.forEach(num->{
			System.out.print(num+" ");
		});
		//=====================================================//
		List<Integer> list2 = new LinkedList<Integer>();
		for(int i = 0 ; i < 10 ; i ++)
			list2.add(i);
		
		for(int i = 0 ; i < list2.size() ; i ++){
			if(list2.get(i)%2==0){
				list2.remove(i);
				i--;
			}
		}
		System.out.println();
		list2.forEach(i->{
			System.out.print(i+" ");
		});
		//=====================================================//
		LinkedList<String> tp = new LinkedList<String>();
		String[] ret =list.stream().toArray(String[]::new);
		//=====================================================//
		LinkedList<Integer> intLinkedListTP=Arrays.stream( a ).boxed().collect( Collectors.toCollection(LinkedList::new));
	}

}
