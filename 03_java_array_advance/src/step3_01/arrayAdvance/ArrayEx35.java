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



public class ArrayEx35 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] score = null;
		int elementCnt = 0;
		
		while (true) {											// 무한 루프 시작
			
			for (int i=0; i<elementCnt; i++) {					// 기초값 = 3 >> 스코어1 " " + 스코어2 " " + 스코어3 " "
				System.out.print(score[i] + " ");				//처음 나오는 값
			}
			System.out.println();
			
			System.out.println("[벡터 컨트롤러]");				//메뉴
			System.out.println("[1]추가");
			System.out.println("[2]삭제(인덱스)");
			System.out.println("[3]삭제(값)");
			System.out.println("[4]삽입");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");					
			int sel = scan.nextInt();							// 메뉴 선택
			
			if (sel == 1) {										// 메뉴 1
				if (elementCnt == 0) {							// 기초가 0일 때
					score = new int[elementCnt + 1];			//점수 = 새로운 주소를 창설(점수) >> '점수 주소'의 크기 = 1
				}
				else if (elementCnt > 0){						// 기초가 0이 아닐 때
					int[] temp = score;							// '탬프 주소' 창설 >
					score = new int[elementCnt + 1];			// '점수 주소' == 기초 + 1
					
					for (int i=0; i<elementCnt; i++) {			
						score[i] = temp[i];
					}
					
					temp = null;
				}
				System.out.print("[추가]성적 입력 : ");
				int data = scan.nextInt();
				
				score[elementCnt] = data;
				elementCnt++;
			}
			else if (sel == 2) {
				System.out.print("[삭제]인덱스 입력 : ");
				int delIdx = scan.nextInt();
				
				if (elementCnt-1 < delIdx || delIdx < 0) {							// 기초값 - 1 보다 삭제하려고 입력한 덱스 값이 작을 때
					System.out.println("[메세지]해당 위치는 삭제할 수 없습니다.");	// 혹은 삭제하려고 한 값이 0보다 작을 때 >> continue
					continue;
				}	
				
				if (elementCnt == 1) {												// 만약 기초값이 1일 때
					score = null;													// 스코어 주소를 0으로 만들어주는 식
				}
				else if (elementCnt >= 1) {											// 만약 기초값이 1이 아닐 때
					int[] temp = score;												// 템프 만들고
					score = new int[elementCnt - 1];								// 스코어 주소는 기초값에서 1 뺀 식 >> 방 하나를 삭제
					
					for (int i=0; i<delIdx; i++) {									// 삭제하려는 인덱스 전까지는 복사
						score[i] = temp[i];
					}																// >>지우려는 인덱스부터 끝까지
					for (int i=delIdx; i<elementCnt-1; i++) {						// 지우려는 인덱스 - 1 = 기초값
						score[i] = temp[i + 1];										// 스코어 방 = 템프 방에서 하나 더한 값 !
					}
					temp = null;													// 템프 삭제
				}
				
				elementCnt--;														// 스코어 방 하나 뺐으니 기초값도 하나 뺌
			}
			else if (sel == 3) {
				System.out.print("[삭제]값 입력 : ");
				int delData = scan.nextInt();
				
				int delIdx = -1;													// 지우려는 인덱스를 아무 값으로 설정
				for (int i=0; i<elementCnt; i++) {									 
					if (score[i] == delData) {										// 지우려는 값이 스코어 방에 있을 때
						delIdx = i;													// 스코어 방의 번호를 지우려는 인덱스로 지정
					}
				}
				
				if (delIdx == -1) {													// 지우려는 방의 번호가 없을 때(바로 위의 식 실행 X)
					System.out.println("[메세지]입력하신 값은 존재하지 않습니다.");	
					continue;
				}
				
				if (elementCnt == 1) {												// 기초값이 1일 때(지우려는 방의 번호가 0일 때)
					score = null;													// 스코어 집 삭제
				}
				else if (elementCnt > 1) {											// 기초값이 1이 아닐 때(지우려는 방의 번호가 0이 아닐 때)
					int[] temp = score;												// 템프 집 생성 및 스코어 집 복사
					score = new int[elementCnt - 1];								// 스코어 방 (기초값 - 1로) 새로 생성
					
					int j = 0;														// j 변수 생성
					for (int i=0; i<elementCnt; i++) {								// 만약 지우려는 인덱스와 i가 같지 않다 >> 다 복사
						if (i != delIdx) {											
							score[j++] = temp[i];									// 스코어 집과 템프 집을 복사
																					// j++;
							//score[j] = temp[i]; 위의 식은 이와 같음
							//j++;
						}
					}
					
					temp = null;
				}
				
				elementCnt--;				
			}
			else if (sel == 4) {
				System.out.print("[삽입]인덱스 입력 : ");
				int insertIdx = scan.nextInt();
				
				if (elementCnt < insertIdx || insertIdx < 0) {
					System.out.println("[메세지]해당 위치는 삽입할 수 없습니다.");
					continue;
				}
				
				System.out.print("[삽입]값 입력 : ");
				int insertData = scan.nextInt();
				
				if (elementCnt == 0) {
					score = new int[elementCnt + 1];
				}
				else if (elementCnt > 0) {
					int[] temp = score;
					score = new int[elementCnt + 1];
					
					int j = 0;
					
					for (int i=0; i<elementCnt + 1; i++) {
						if (i != insertIdx) {
							score[i] = temp[j++];
						}
					}
					temp = null;
				}
				
				score[insertIdx] = insertData;
				elementCnt++;
			}
			else if (sel == 0) {
				break;
			}
		}

		scan.close();

	}

}