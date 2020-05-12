package com.CRUD;

import java.io.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class C_Create {
	public void C_txt(String TxtName) throws IOException {			
		File f = new File("D:\\SE_lastwork\\"+TxtName+".txt");
		ArrayList<String> list = new ArrayList<>();
		FileInputStream fis = new FileInputStream(f);
		InputStreamReader isr =new InputStreamReader(fis,"UTF-8");
		BufferedReader br = new BufferedReader(isr);
		String line;
		while ((line = br.readLine()) != null) {
			list.add(line);
		}			
		// 遍历集合
		System.out.println("------增加前--------");
		for (String s : list) {
			System.out.println(s);
		}
		//操作集合
		int C_numb=numb.user_numb();
		String C_line=numb.user_change();
		list.add(C_numb, C_line);	
		// 遍历集合
				System.out.println("------增加后--------");
				for (String s : list) {
					System.out.println(s);
				}
		//保存修改
		FileOutputStream writerStream = new FileOutputStream(f); 
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(writerStream, "UTF-8")); 		
		for (int i = 0; i < list.size(); i++) {
			String str =list.get(i);
			writer.write(str);	
			writer.newLine();
		}

	    writer.close();					
		br.close();	
	}
}
