package com.GL.PayMoney.Lab2;

class Targets {

	public static void targetAchieved(int targetValue, int[]transactions) {
		int flag=0;
	
		int sum = 0;
		for (int i = 0; i < transactions.length; i++) {
		sum += transactions[i];
		if (sum >= targetValue) {
		System.out.println("Target achieved after "+" " + ( i + 1) + " transactions ");
		flag = 1;
		break;
		}
		}
		if (flag == 0) {
		System.out.println("Target is not achieved ");
	}

}
}