package com.study.dreamComeTrue.Baekjoon.Chap2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Author : �Գ���
 * create date : 2020-01-05
 * ���� : 10808 ���ĺ� ����
 * ���� �ð� : 76 ms
 * */
public class saera111111_10808_알파벳개수 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String S = in.readLine();
		int[] alphabet = new int[26];
		
		for(int i=0; i < S.length(); i++) {
			alphabet[S.charAt(i) - 'a']++;
		}
		
		for(int i = 0; i< 26; i++) {
			System.out.print(alphabet[i] + " ");
		}
	}

}
