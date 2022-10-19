package step3_01.arrayAdvance;

import java.util.Scanner;

//2022-10-14 오후 5시 19분 ~ 

/*
 *	# 관리비
*/

public class ArrayEx40_풀이 {

	public static void main(String[] args) {
		
		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
			
		int[][] pay = {
			{1000, 2100, 1300},	
			{4100, 2000, 1000},	
			{3000, 1600,  800}
		};
			
		// 문제 1) 각층별 관리비 합 출력
		// 정답 1) 4400, 7100, 5400
		
		int floor1 = 0;
		int floor2 = 0;
		int floor3 = 0;
		
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				floor1 = pay[0][j];
				floor2 = pay[0][j];
				floor3 = pay[0][j];
			}
		}
		System.out.println("1층 관리비: " + floor1 + " 2층 관리비: " + floor2 + " 3층 관리비: " + floor3);
		System.out.println();
		
		// 문제 2) 호를 입력하면 관리비 출력
		// 예    2) 입력 : 202	관리비 출력 : 2000
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("호를 입력하세요: ");
		
		int inputHo = scan.nextInt();
		int extra1 = 0;
		int extra2 = 0;
		
		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt[i].length; j++) {
				if (inputHo == apt[i][j]) {
					extra1 = i;
					extra2 = j;
				}
			}
		}
		System.out.print("관리비 출력: " + pay[extra1][extra2]);
		System.out.println();
		
		// 문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
		// 정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)
		
		int mostPayHome = 0;
		int leastPayHome = 0;
		int mostPay = 0;
		int leastPay = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				if (mostPay < pay[i][j]) {
					mostPay = pay[i][j];
					a = i;
					b = j;
				}
				
				if (leastPay < pay[i][j]) {
					leastPay = pay[i][j];
					if (leastPay < pay[i][j]) {
						leastPay = pay[i][j];
						c = i;
						d = j;
					}
				}
			}
		}
		mostPayHome = apt[a][b];
		
		System.out.print("관리비가 가장 많이 나온 집: " + mostPayHome + "관리비가 가장 적게 나온 집: " + leastPayHome);
		
		// 문제 4) 호 2개를 입력하면 관리비 교체
		
		System.out.println("한 개의 호를 입력해주세요: ");
		int firstHo = scan.nextInt();
		System.out.println("한 개의 호를 입력해주세요: ");
		int secondHo = scan.nextInt();
		
		int x = -1;
		int y = -1;
		int z = -1;
		int q = -1;
		
		int temp1 = -1;
		
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				if (firstHo == apt[i][j]) {
					x = i;
					y = j;
				}
			}
		}
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				if (secondHo == apt[i][j]) {
					z = i;
					q = j;
				}
			}
		}
		temp1 = apt[x][y];
		apt[x][y] = apt[z][q];
		apt[z][q] = apt[x][y];
		
		
				
	}

}
