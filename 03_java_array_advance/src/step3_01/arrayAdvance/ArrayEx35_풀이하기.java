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



public class ArrayEx35_풀이하기 {

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
				
				System.out.print("[추가] 성적입력: ");
				int inputScore = scan.nextInt();
				
				score[0] = inputScore;
				elementCnt++;
				
			}
			
			else if (sel == 2) {
				
				if (elementCnt == 0) {
					System.out.println("삭제할 값이 없습니다.");
				}
				
				else if (elementCnt == 1) {
					score = null;
				}
				
			}
			
			else if (sel == 3) {
				
			}
			
			else if (sel == 4) {
				
			}
			
			else if (sel == 0) {
				
			}
			
		}
		
		
	}

}