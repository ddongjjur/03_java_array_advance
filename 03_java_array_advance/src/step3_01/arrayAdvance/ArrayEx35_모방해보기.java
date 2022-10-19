package step3_01.arrayAdvance;

import java.util.Scanner;

/*
 * 
 * # 배열 컨트롤러[2단계] : 벡터(Vector)
 * 
 * 1. 추가
 * . 값을 입력받아 순차적으로 추가
 * 2. 삭제(인덱스)
 * . 인덱스를 입력받아 해당 위치의 값 삭제
 * 3. 삭제(값)
 * . 값을 입력받아 삭제
 * . 없는 값 입력 시 예외처리
 * 4. 삽입
 * . 인덱스와 값을 입력받아 삽입
 * 
 */



public class ArrayEx35_모방해보기 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] score = null;
		int elementCnt = 0;
		
		while (true) {
			
			for (int i = 0; i < elementCnt; i++) {
				System.out.print(score[i] + " ");
			}
			
			System.out.println();
			
			System.out.println("[백터 컨트롤러]");
			System.out.println("[1]추가");
			System.out.println("[2]삭제(인덱스)");
			System.out.println("[3]삭제(값)");
			System.out.println("[4]삽입");
			System.out.println("[0]종료");
			System.out.print("메뉴 선택: ");
			
			int sel = scan.nextInt();
			
			if (sel == 1) {
				if (elementCnt == 0) {
					score = new int[elementCnt + 1];
				}
				
				else if (elementCnt != 0) {
					int temp[] = score;
					score = new int[elementCnt + 1];
					
					for (int i = 0; i < elementCnt; i++) {
						score[i] = temp[i];
					}
					
					temp =null;
				}
				System.out.println("[추가]성적 입력: ");
				int inputScore = scan.nextInt();
				
				score[elementCnt] = inputScore;
				elementCnt++;
			}
			
			else if (sel == 2) {
				System.out.print("[삭제]인덱스 입력: ");
				int delIdx = scan.nextInt();
				
				if (delIdx < 0 || delIdx > elementCnt - 1) {
					System.out.println("해당 위치는 삭제할 수 없습니다.");
				}
				else if (delIdx == 0) {
					score = null;
				}
				
				else if (delIdx != 0) {
					int[] temp = score;
					score = new int[elementCnt - 1];
					
					for (int i = 0; i < delIdx; i++) {
						score[i] = temp[i];
					}
					
					for (int i = delIdx; i < elementCnt - 1; i++) {
						score[i] = temp[i + 1];
					}
					temp = null;
				}
				
				elementCnt--;
			}
			
			else if (sel == 3) {
				System.out.print("[삭제]값 입력: ");
				int delScore = scan.nextInt();
				
				int delIdx = -1;
				for (int i = 0; i < elementCnt; i++) {
					if (delScore == score[i]) {
						delIdx = i;
					}
					
					}
				if (delScore != -1) {
					System.out.println("입력하신 값은 존재하지 않습니다.");
				}
				
				else if (elementCnt == 1) {
					score = null;
				}
				
				else if (elementCnt != 1) {
					int[] temp = score;
					score = new int[elementCnt - 1]; 

					int j = 0;
					for (int i = 0; i < elementCnt; i++) {
						if (delIdx != i) {
							score[j] = temp[i];
							j++;
						}
					}
					temp = null;
				}
			}
		}
		
		
	}

}