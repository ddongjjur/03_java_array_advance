package step3_01.arrayAdvance;

import java.util.Scanner;

// #오목

public class ArrayEx44_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int size = 10;
		int[][] omok = {{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0}
		};
		
		int p1Y = 0;
		int p1X = 0;
		int p2Y = 0;
		int p2X = 0;
		int turn = 0;
		int win = 0;
		
		while (true) {
			
			System.out.println(" ===== 오목 게임 =====");
			System.out.println();
			System.out.print("  ");
			for (int i = 0; i < size; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			for (int i = 0; i < size; i++) {
				System.out.print(i + " ");
				for (int j = 0; j < size; j++) {
					System.out.print(omok[i][j] + " ");
				}
				System.out.println();
			}
			
			if (win == 1) {
				System.out.println("p1 승리!!");
				break;
			}
			
			else if (win == 2) {
				System.out.println("p2 승리!!!");
				break;
			}
			
			if (turn % 2 == 0) {
				System.out.println("[p1 차례]");
				System.out.print("[p1] Y좌표 입력: ");
				p1Y = scan.nextInt();
				System.out.print("[p1] X좌표 입력: ");
				p1X = scan.nextInt();
				
				if (omok[p1Y][p1X] == 0) {
					
				}
			}
			
		}
	}
}
