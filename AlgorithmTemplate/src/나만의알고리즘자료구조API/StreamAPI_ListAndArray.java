package 나만의알고리즘자료구조API;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamAPI_ListAndArray {

	public static void main(String[] args){
		//================================================================================================================//
		//1. int[]을 Integer[], List<Integer>,LinkedList<Integer>로 만들기

		int[] data = {1,2,3,4,5,6,7,8,9,10};

		// To boxed array
		Integer[] what = Arrays.stream( data ).boxed().toArray( Integer[]::new );
		Integer[] ever = IntStream.of( data ).boxed().toArray( Integer[]::new );

		// To boxed list
		List<Integer> you  = Arrays.stream( data ).boxed().collect( Collectors.toList() );
		List<Integer> like = IntStream.of( data ).boxed().collect( Collectors.toList() );

		//To boxed LinkedList or ArrayList
		LinkedList<Integer> you2  = Arrays.stream( data ).boxed().collect( Collectors.toCollection(LinkedList::new));
		LinkedList<Integer> like2 = IntStream.of( data ).boxed().collect( Collectors.toCollection(LinkedList::new));
		//================================================================================================================//
		//2. Integer[]을 int[], List<Integer>,LinkedList<Integer>로 만들기
		Integer[] boxedData={1,2,3,4,5,6,7,8,9,10};
		
		// To primitive array
		int[] boxedWhat = Arrays.stream(boxedData).mapToInt(Integer::intValue).toArray();
		
		// To boxed list
		List<Integer> boxedYou=Arrays.stream(boxedData).collect(Collectors.toList());
		
		//To boxed LinkedList or ArrayList
		LinkedList<Integer> boxedYou2  = Arrays.stream( boxedData ).collect( Collectors.toCollection(LinkedList::new));
		
		//================================================================================================================//
		//3. List<Integer> 를 int[], Integer[], LinkedList<Integer>로 만들기
		List<Integer> listData=new LinkedList<Integer>();
		
		// To primitive array
		int[] listWhat = listData.stream().mapToInt(Integer::intValue).toArray();
		
		//To boxed Array
		Integer[] listYou = listData.stream().toArray(Integer[]::new);
		
		//To boxed LinkedList or ArrayList
		LinkedList<Integer> listYou2=new LinkedList<Integer>(listData);
		
		//================================================================================================================//
		//3. ArrayList<Integer> 를 int[], Integer[], List<Integer>로 만들기
		
		LinkedList<Integer> linkedListData = new LinkedList<Integer>();
		
		//To primitive array
		int[] linkedlistWhat=linkedListData.stream().mapToInt(Integer::intValue).toArray();
		
		//To boxed array
		
		Integer[] linkedlistYou = linkedListData.stream().toArray(Integer[]::new);
		
		//to List
		List<Integer> linkedlistyou2 = linkedListData;
		linkedlistyou2.sort(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		});
	}
}
