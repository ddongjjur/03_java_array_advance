package step3_01.arrayAdvance;

public class arrayEx36 {

	public static void main(String[] args) {
		
		//축약형
		int[] testarr1 = {1,2,3,4,5};
		int[][] testarr2 = {
							{1,2,3,4,5},
							{6,7,8,9,10},
							{11,12,13,14,15}
							};
		
		char[] testarr3 = {'o','o','o','x','x'};
		char[][] testarr4 = {
								{'o','o','o','x','x'},
								{'o','o','o','x','x'}
							};
		
		
		
		int[][] arr = new int[2][4];
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[0][3] = 40;
		
		arr[1][0] = 50;
		arr[1][1] = 60;
		arr[1][2] = 70;
		arr[1][3] = 80;
		
		System.out.println("arr: " + arr); 			//주소
		System.out.println("arr: " + arr[0]); 		//주소
		System.out.println("arr: " + arr[1]); 		//주소
		System.out.println();
		
		System.out.println("arr[0][0]: " + arr[0][0]);		//값
		System.out.println("arr[0][1]: " + arr[0][1]);		//값
		System.out.println("arr[0][2]: " + arr[0][2]);		//값
		System.out.println("arr[0][3]: " + arr[0][3]);		//값
		
		System.out.println("arr[1][0]: " + arr[1][0]);		//값
		System.out.println("arr[1][1]: " + arr[1][1]);		//값
		System.out.println("arr[1][2]: " + arr[1][2]);		//값
		System.out.println("arr[1][3]: " + arr[1][3]);		//값
		System.out.println();
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("arr.length: " + arr.length);
		System.out.println("arr[0].length: " + arr[0].length);
		System.out.println("arr[1].length: " + arr[1].length);
		System.out.println();
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		//생각해보기
		
		int[][] temp1 = arr; 		//주소
		int[] temp2 = arr[0];		//주소
		int[] temp3 = arr[1];		//주소
		int temp4 = arr[0][0];		//값
		int temp5 = arr[1][1];		//값
		
	}

}
