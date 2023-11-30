package com.example.demo.controller;

import java.util.Random;

public class MergeHellController {

	public static void main(String[] args) {

		kadaiB();


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
