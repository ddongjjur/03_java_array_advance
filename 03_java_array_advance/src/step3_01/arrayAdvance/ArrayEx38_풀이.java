package step3_01.arrayAdvance;

import java.util.Scanner;

//2022-10-14 오후 3시 57분 ~ 4시 54분

/*
 *	# 2차원배열 기본문제[2단계]
*/

public class ArrayEx38_풀이 {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][3];
		
		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예    1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
		
		Scanner scan = new Scanner(System.in);
		
		
		boolean isRun = true;
		
		while (isRun) {
			System.out.print("인덱스1 입력: ");
			int inputIdx1 = scan.nextInt();
			
			System.out.print("인덱스2 입력: ");
			int inputIdx2 = scan.nextInt();

			if (inputIdx1 < 0 || inputIdx1 > 2 || inputIdx2 < 0 || inputIdx2 > 2) {
				System.out.println("값을 잘못 입력하셨습니다.(0 ~ 2 사이의 숫자를 입력하세요.)");
				continue;
			}
			
			else if (inputIdx1 >= 0 && inputIdx1 <= 2 && inputIdx2 >= 0 && inputIdx2 <= 2) {
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
					}
				}
				System.out.println("값 출력: " + arr[inputIdx1][inputIdx2]);
				isRun = false;
			}
			
		}
		
		System.out.println();
		
		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예    2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		
		System.out.print("값 입력: ");
		int inputPrice = scan.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				if (inputPrice == arr[i][j]) {
					System.out.println("인덱스1 출력: " + i + " 인덱스2 출력: " + j);
				}
			}
		}
		System.out.println();
		
		// 문제 3) 가장 큰 값의 인덱스 2개 출력
		// 정답 3) 2 2
		
		System.out.print("가장 큰 값의 인덱스 2개 = ");
		
		int maxIdx = arr[0][0]; 
		int xIdx = 0;
		int yIdx = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				if (maxIdx < arr[i][j]) {
					maxIdx = arr[i][j];
					xIdx = i;
					yIdx = j;
				}
				
			}
		}
		System.out.print("인덱스1: " + xIdx + " 인덱스2: " + yIdx);
		System.out.println();
		System.out.println();
		
		// 문제 4) 값 2개를 입력받아 값 교체
		
		System.out.println("변경할 두 값을 입력하세요");
		int change1 = scan.nextInt();
		int change2 = scan.nextInt();
		int extra1 = 0;
		int extra2 = 0;
		int extra3 = 0;
		int extra4 = 0;
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (change1 == arr[i][j]) {
					extra1 = i;
					extra2 = j;
				}
				
				else if (change2 == arr[i][j]) {
					extra3 = i;
					extra4 = j;
				}
				
			}
		}
		
		int temp = arr[extra1][extra2];
		arr[extra1][extra2] = arr[extra3][extra4];
		arr[extra3][extra4] = temp;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		scan.close();
	}

}
