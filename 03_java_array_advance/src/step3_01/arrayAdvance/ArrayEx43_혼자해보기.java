package step3_01.arrayAdvance;

/*
 * # 달팽이
 * 
 * 1	2	3	4	5	
 * 16	17	18	19	6	
 * 15	24	25	20	7	
 * 14	23	22	21	8	
 * 13	12	11	10	9
 * 
 * 
 * 1) 오른쪽 방향으로 순서대로 숫자저장
 * 2) 아래쪽 방향으로 순서대로 숫자저장
 * 3) 왼쪽 방향으로 순서대로 숫자저장
 * 4) 윗쪽 방향으로 순서대로 숫자저장
 * 
 * 1)2)3)4) 반복
 */


public class ArrayEx43_혼자해보기 {

	public static void main(String[] args) {
		
		int size = 5;
		int[][] map = new int[5][5];
		boolean [][] check = new boolean[5][5];
		
		int x = 0;
		int y = 0;
		int num = 1;
		int dir = 1;
		
		map[y][x] = num;
		check[y][x] = true;
		
		for (int i = 0; i < 24; i++) {
			int xx = x;
			int yy = y;
			
			if (dir == 1) xx += 1;
			else if (dir == 2) yy += 1;
			else if (dir == 3) xx -= 1;
			else if (dir == 4) yy -= 1;
			
			if (size == xx || size == yy || xx < 0 || xx < 0 || check[yy][xx] == true) {
				
				dir += 1;
				
				xx = x;
				yy = y;
				
				if (dir == 5) dir = 1;
				
				if (dir == 1) xx += 1;
				else if (dir == 2) yy += 1;
				else if (dir == 3) xx -= 1;
				else if (dir == 4) yy -= 1;
			}
			
			num++;
			
			y = yy;
			x = xx;
			
			map[y][x] = num;
			check[y][x] = true;
			
		}
		for (int i = 0; i < check.length; i++) {
			for (int j = 0; j < check[i].length; j++) {
				
				System.out.print(map[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
	}

}
