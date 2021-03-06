package 나만의알고리즘자료구조API;

public class DFS {

	static int dy[] = new int[] { -1, 1, 0, 0 };
	static int dx[] = new int[] { 0, 0, -1, 1 };
	static int N; //정사각 보드인경우 사이즈
	static int path[] ;// 중간 경로 저장용 배열 x번째 이동에 상하좌우중 어떻게 왔는가를 저장
	static int pathTotalNum=0; // 도착까지의 경로가 총 몇개인지 체크
	static int res=Integer.MAX_VALUE;// 최단경로 step수를 찾으라 하는경우 사용
	
	public static void main(String[] args){
		int[][] board = new int[][]{{0,0,0},{0,0,0},{0,0,0}};
		N=board.length;
		path = new int[N * N];
		board[0][0]=0;		//시작점은 미리 방문처리해주기, 안하면  다시되돌아오기때문
		dfs(0,0,0,board);
		System.out.println(pathTotalNum);
		
	}

 
    public static void dfs(int next, int nowY, int nowX,int[][] board) {

		if (nowY == N - 1 && nowX == N - 1) {
			//todo
			pathTotalNum++;
			return;
		}

		int nextY = -1;
		int nextX = -1;

		for (int i = 0; i < 4; i++) {
			nextY = nowY + dy[i];
			nextX = nowX + dx[i];
			if (nextY < 0 || nextX < 0 || nextY >= N || nextX >= N) {
				continue;
			}
			if(board[nextY][nextX]==1)
				continue;
			board[nextY][nextX]=1;
			path[next]=i; //next 번째 depth에 상하좌우중 어떤 무브로 왔는가를 저장.
			dfs(next + 1, nextY, nextX,board);
			board[nextY][nextX]=0;
		}

	}
	
}
