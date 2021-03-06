package 나만의알고리즘자료구조API;


import java.util.ArrayList;

public class SpinArray {

	public static void main(String[] args){

		int[][] map = new int[][]{
			{1,2,3,4,5,6},
			{7,8,9,10,11,12},
			{13,14,15,16,17,18},
			{19,20,21,22,23,24},
			{25,26,27,28,29,30},
			{31,32,33,34,35,36}
		};				
		print(map);
//		System.out.println("\n\nspinRight");
//		print(spinRight(map));
//		System.out.println("\n\nspinRight2");
//		print(spinRight2(map));
//		System.out.println("\n\nspinLeft");
//		print(spinLeft(map));
//		System.out.println("\n\nspinLeft2");
//		print(spinLeft2(map));
		

		System.out.println("\n\n partiallySpinRight");
		System.out.println("left:3, top:3, right:5,bottom:5");
		print(partiallySpinRight(map, 3, 3, 5, 5));
		
		System.out.println("\n\n partiallySpinRight2");
		System.out.println("left:3, top:3, right:5,bottom:5");
		print(partiallySpinRight2(map, 3, 3, 5, 5));
		

		
	}
	public static int[][] partiallySpinRight(int[][] map, int left, int top, int right , int bottom){
		int[][] newMap= new int[6][6];
		
		for(int i = 0 ; i <=right-left ; i ++){
			for(int j = 0 ;j <= bottom-top ; j ++){
				
				//newMap[i+top][j+left]= map[j+top][(right-left+1)-i-1+left];
				newMap[i+top][j+left]=map[3-j-1+top][i+left];
			}
		}
		
		return newMap;
	}
	
	public static int[][] partiallySpinRight2(int[][] map, int left, int top, int right , int bottom){
		int[][] newMap= new int[6][6];
		int idx=0;
		for(int j=left ; j <=right;j++){
			for(int i =bottom ; i>=top;i--){
				newMap[idx/(bottom-top+1)+top][idx%(right-left+1)+left]=map[i][j];
				idx++;
			}
		}
		
		return newMap;		
	}
	
	
	
	public static int[][] spinRight(int[][] map){
		int[][] newMap=new int[6][6];
		for(int i = 0 ; i < 6 ; i ++){
			for(int j = 0 ; j < 6 ; j ++){
				newMap[i][j]=map[6-j-1][i];
			}
		}
		return newMap;
	}
	public static int[][] spinRight2(int[][] map){
		int[][] newMap= new int[6][6];
		int idx=0;
		for(int j = 0 ; j < 6 ; j ++){
			
			for(int i =6-1 ; i >=0 ; i--){
				newMap[idx/6][idx%6]=map[i][j];
				idx++;
			}
			
		}
		
		return newMap;
	}
	
	public static int[][] spinLeft2(int[][] map){
		int[][] newMap= new int[6][6];
		int idx=0;
		for(int j =5 ; j >=0 ; j-- ){
			for(int i = 0 ; i < 6 ; i ++){
				newMap[idx/6][idx%6]=map[i][j];
				idx++;
			}
		}
		return newMap;
	}
	
	public static int[][] spinLeft(int[][] map){
		int[][] newMap= new int[6][6];
		
		for(int i = 0 ; i < 6 ; i ++){
			for(int j = 0 ; j < 6 ; j ++){
				newMap[i][j]=map[j][6-i-1];
			}
		}
		return newMap;
	}
	
	public static void print(int[][] map){		
		for(int i = 0 ; i < 6 ; i ++){
			System.out.println();
			for(int j = 0 ; j< 6 ; j++){				
				System.out.printf("%3d",map[i][j]);				
			}
		}
	}
	
}
