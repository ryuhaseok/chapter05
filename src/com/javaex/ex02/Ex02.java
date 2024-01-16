package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		
		Reader fr = new FileReader("C:\\javaStudy\\song.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String str = br.readLine();
			if(str == null) { // == : 주소 비교 / .equals :내용 비교
				break;
			}
			System.out.println(str);
		}
		
		br.close();
		
		
	}

}
