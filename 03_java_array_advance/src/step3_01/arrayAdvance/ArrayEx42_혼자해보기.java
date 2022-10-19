package step3_01.arrayAdvance;

import java.util.Scanner;

/*
 * 
 * # 나만의 마블
 * 
 * 옷 □ □ □ □ 
 * □ ■ ■ ■ □ 
 * □ ■ ■ ■ □ 
 * □ ■ ■ ■ □ 
 * □ □ □ □ □
 * 
 * 
 * 정답의 소스를 컴파일 해보고 동작을 파악하여 코드를 작성하기.
 * 
 */

public class ArrayEx42_혼자해보기 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int player = 0;
		int block = 20;
		
		while (true) {
			
			int[][] map = {
					{0,   1,  2,  3, 4},	
					{15, 20, 20, 20, 5},
					{14, 20, 20, 20, 6},
					{13, 20, 20, 20, 7},
					{12, 11, 10,  9, 8}};
			
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					if (map[i][j] == block) {
						System.out.print("■  ");
					}
					
					else if (map[i][j] == player) {
						System.out.print("웃 ");
					}
					else {
						System.out.print("□  ");
					}
				}
				System.out.println();
			}
			System.out.println();
			
			System.out.println("1 ~ 3 사이의 숫자를 입력하세요.");
			int move = scan.nextInt();
			
			player += move;
			player %= 16;
			
		}
		
	}

}
