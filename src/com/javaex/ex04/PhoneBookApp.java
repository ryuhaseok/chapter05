package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class PhoneBookApp {

	public static void main(String[] args) {

		//쓰기 쓰면 파일 다 지워짐
		
		//파일에서 읽은 데이터 리스트로 관리
		//(이름, 핸드폰, 회사) --> Person클래스
		
		//자신의 정보 Person을 리스트에 추가하고
		
		//리스트 전체내용을 PhoneDB.txt에 쓴다
		
		Reader fr = new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		
		
		
	}

}
