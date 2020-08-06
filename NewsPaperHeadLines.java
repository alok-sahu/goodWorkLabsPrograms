package com.goodWorkLabs.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class NewsPaperHeadLines {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please write the news");
		String str = br.readLine();
		getHashTags(str);

	}

	private static void getHashTags(String str) {
		String arr[] = str.split(" ");
		List<String> listOfStrings = new ArrayList<>();
		for (String s : arr) {
			listOfStrings.add(s);
		}
		for (int i = 0; i < listOfStrings.size() - 1; i++) {
			for (int j = i + 1; j < listOfStrings.size(); j++) {
				if (listOfStrings.get(i).length() < listOfStrings.get(j).length()) {
					listOfStrings.add(i, listOfStrings.get(j));
					listOfStrings.remove(j + 1);
				}
			}
		}
		List<String> list = new ArrayList<>();
		for (int i = 0; i < listOfStrings.size(); i++) {
			String str1 = "#" + listOfStrings.get(i);
			if (list.size() < 3) {
				list.add(str1.toLowerCase());
			}
		}
		System.out.print(list);
	}
}
