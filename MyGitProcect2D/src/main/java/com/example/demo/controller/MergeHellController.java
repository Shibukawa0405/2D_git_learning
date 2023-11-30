package com.example.demo.controller;

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
}