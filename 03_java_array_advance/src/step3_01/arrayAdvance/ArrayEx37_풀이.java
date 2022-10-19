package step3_01.arrayAdvance;

//2022-10-14 오후 3시 49분 ~ 3시 57분

/*
 *	# 2차원배열 기본문제[1단계]
*/

public class ArrayEx37_풀이 {

	public static void main(String[] args) {

		int[][] arr = new int[3][3];
		
		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 10 * k;
				k++;
			}
		}
		
		// 문제 1) 전체 합 출력
		// 정답 1) 450
		int hap = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				hap += arr[i][j];
			}
		}
		System.out.println(hap);
		System.out.println();
		
		// 문제 2) 4의 배수만 출력
		// 정답 2) 20 40 60 80 
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 4 == 0) {
					System.out.print(arr[i][j] + " ");
				}
			}
		}
		System.out.println();
		System.out.println();
		
		// 문제 3) 4의 배수의 합 출력
		// 정답 3) 200
		int mul4Hap = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 4 == 0) {
					mul4Hap += arr[i][j];
				}
			}
		}
		System.out.println(mul4Hap);
		System.out.println();
		
		// 문제 4) 4의 배수의 개수 출력
		// 정답 4) 4
		
		int mul4cnt = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 4 == 0) {
					mul4cnt++;
				}
			}
		}
		System.out.println(mul4cnt);
		System.out.println();
	}

}
