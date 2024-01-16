package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class PhoneBookApp {

	public static void main(String[] args) throws IOException {

		//쓰기 쓰면 파일 다 지워짐
		
		//파일에서 읽은 데이터 리스트로 관리
		//(이름, 핸드폰, 회사) --> Person클래스
		
		//자신의 정보 Person을 리스트에 추가하고
		
		//리스트 전체내용을 PhoneDB.txt에 쓴다
		
		Reader fr = new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		List<Person> pList = new ArrayList<Person>();

		while(true) {
			String str = br.readLine();
			Person p = new Person();
			
			if(str == null) {
				break;
			}
			String[] info = str.split(",");
			p.setName(info[0]);
			p.setHp(info[1]);
			p.setCompany(info[2]);
			pList.add(p);
			
		}
		
		Person my = new Person();
		my.setName("류하석");
		my.setHp("010-1234-5678");
		my.setCompany("041-2222-9876");
		pList.add(my);
		
		
		Writer fw = new FileWriter("C:\\\\javaStudy\\\\PhoneDB.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		for(int i=0; i<pList.size(); i++) {
			bw.write("이름: " + pList.get(i).getName());
			bw.newLine();
			bw.write("핸드폰: " + pList.get(i).getHp());
			bw.newLine();
			bw.write("회사: " + pList.get(i).getCompany());
			bw.newLine();
		}
		
		for(int i=0; i<pList.size(); i++) {
			System.out.println("이름: " + pList.get(i).getName());
			System.out.println("핸드폰: " + pList.get(i).getHp());
			System.out.println("회사: " + pList.get(i).getCompany());
			System.out.println("");
		}
	
		
		br.close();
		bw.close();
	}



}
