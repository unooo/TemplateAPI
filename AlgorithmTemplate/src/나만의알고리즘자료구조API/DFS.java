package �����Ǿ˰����ڷᱸ��API;

public class DFS {

	static int dy[] = new int[] { -1, 1, 0, 0 };
	static int dx[] = new int[] { 0, 0, -1, 1 };
	static int N; //���簢 �����ΰ�� ������
	static int path[] ;// �߰� ��� ����� �迭 x��° �̵��� �����¿��� ��� �Դ°��� ����
	static int pathTotalNum=0; // ���������� ��ΰ� �� ����� üũ
	static int res=Integer.MAX_VALUE;// �ִܰ�� step���� ã���� �ϴ°�� ���
	
	public static void main(String[] args){
		int[][] board = new int[][]{{0,0,0},{0,0,0},{0,0,0}};
		N=board.length;
		path = new int[N * N];
		board[0][0]=0;		//�������� �̸� �湮ó�����ֱ�, ���ϸ�  �ٽõǵ��ƿ��⶧��
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
			path[next]=i; //next ��° depth�� �����¿��� � ����� �Դ°��� ����.
			dfs(next + 1, nextY, nextX,board);
			board[nextY][nextX]=0;
		}

	}
	
}
