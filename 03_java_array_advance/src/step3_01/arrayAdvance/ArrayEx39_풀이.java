package step3_01.arrayAdvance;


//2022-10-14 오후 4시 55분 ~ 오후 5시 18분

/*
 *	# 2차원배열 기본문제[3단계]
*/

public class ArrayEx39_풀이 {

	public static void main(String[] args) {
		
		int[][] arr = {
			{101, 102, 103, 104},
			{201, 202, 203, 204},
			{301, 302, 303, 304}
		}; 
		
		int[] garo = new int[3];
		int[] sero = new int[4];
		
		// 문제 1) 가로 합 출력
		// 정답 1) 410, 810, 1210
		
		int garo1 = 0;
		int garo2 = 0;
		int garo3 = 0;
		
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				garo1 += arr[0][j];
				garo2 += arr[1][j];
				garo3 += arr[2][j];
			}
		}
		System.out.print("가로의 합: " + garo1 + ", " + garo2 + ", " + garo3);
		System.out.println();
		
		// 문제 2) 세로 합 출력
		// 정답 2) 603, 606, 609, 612

		int sero1 = 0;
		int sero2 = 0;
		int sero3 = 0;
		int sero4 = 0;
		
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				sero1 += arr[j][0];
				sero2 += arr[j][1];
				sero3 += arr[j][2];
				sero4 += arr[j][3];
				
				//{101, 102, 103, 104},
				//{201, 202, 203, 204},
				//{301, 302, 303, 304}
			}
		}
		System.out.print("세로의 합: " + sero1 + ", " + sero2 + ", " + sero3 + ", " + sero4);
	}

}
