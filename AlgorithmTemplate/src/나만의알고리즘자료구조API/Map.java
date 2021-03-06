package �����Ǿ˰����ڷᱸ��API;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.stream.Collectors;

public class Map {

	
	public static void main(String[] args){
		HashMap<String,Integer> hMap = new HashMap<String, Integer>();	
		for(int i = 0 ; i < 5 ; i ++){
			hMap.put((char)('A'+i)+"", 5-i);
		}
		//================================================//
		// 1. ���� value�� ����  --> �� ��ü�� �����ϴ°� �ƴ϶� Ű�� �����Ͽ� �� Ű�� �������� ������ ã�°�
		//�߿�1
		List<String> keyList =  new ArrayList<>(hMap.keySet());
		//�߿�2
		Collections.sort(keyList,(a,b)->{
			return hMap.get(a).compareTo(hMap.get(b));
			// Ű�� ���ķ� �Ǽ����� ����. ���ʿ� Ű������ Ʈ���� ����
			//return a.compareTo(b);
		});
		//�������
		keyList.stream().forEach(key->{
			System.out.println(key+" "+ hMap.get(key));
		});
		//================================================//
		// 2. �� ��ȸ�ϱ� 
		HashMap<String , Integer> map = new HashMap<String , Integer>();
		 
		 for(String temp : map.keySet()){
			System.out.println(temp);
		 }
		//================================================//
		 //3. �� ����ֱ� ��Ʈ������ �����ϰ�
		 HashMap<String , Integer> map2 = new HashMap<String , Integer>();
		 
		 //#3-1
		 Integer value = map2.get("testKey");
		 if(value==null){
			 map2.put("testKey", 1);
		 }else{
			 map2.put("testKey", value+1);
		 }
		 //#3-2
		 map2.merge("testKey", 1, (oldV,newV)->{
			return oldV+1;
		 });
		//================================================//
		 //4. flatmap ���
		 String[][] namesArray = new String[][]{
		        {"kim", "taeng"}, {"mad", "play"},
		        {"kim", "mad"}, {"taeng", "play"}};
		 String[] ret = Arrays.stream(namesArray)
				 .flatMap(row->{
					  return Arrays.stream(row);
				 }).toArray(String[]::new);
		 
		 Set<String> namesWithFlatMap = Arrays.stream(namesArray)
			        .flatMap(innerArray -> Arrays.stream(innerArray))
			        .filter(name -> name.length() > 3)
			        .collect(Collectors.toSet());
		 
		 List<String>map3= Arrays.stream(namesArray)
				 .flatMap(row->{
					  return Arrays.stream(row);
				 }).collect(Collectors.toList());
		 
		System.out.println(ret.toString());
		
		//====================================================//
		HashMap<String , Integer> map4= new HashMap<String , Integer>();
		map4.put("����",1);
		map4.put(new String("����"), 2);
		map4.keySet().forEach(key->{
			System.out.println(key);
		});
		System.out.println();
		
		//==================================================//
		
        WeakHashMap<Integer, String> map5= new WeakHashMap<>();        
        Integer key1 = 1000;
        Integer key2 = 2000; 
        map5.put(key1, "test a");
        map5.put(key2, "test b"); 
        key1 = null; 
        System.gc();  //���� Garbage Collection 
        map5.entrySet().stream().forEach(el -> System.out.println(el));
        
    	//==================================================//
        
        TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
        
        
   
		
	}
	
	
	
	
}
