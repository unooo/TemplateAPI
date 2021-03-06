package 나만의알고리즘자료구조API;

public class Regex {

	public static void main(String[] args){
		
		//1. 월별에서 숫자앞에 0이있는경우 떼어주기
		
		String str = "01".replaceAll("^0", "");
		System.out.println(str);
	}
}
