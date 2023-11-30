package com.example.demo.controller;

import java.util.Random;

public class MergeHellController {
	public static void main(String[] args) {
		kadaiA();
		kadaiB();
	}

	static void kadaiA() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1 + "回目のループです");
		}
	}

	static void kadaiB() {
		int num;
		//1~100のランダムな数字
		Random rand = new Random();
		num = rand.nextInt(100 + 1);

		//結果出力
		System.out.println("結果は" + num + "です");
	}
}
