package com.CRUD;

import java.io.*;
import java.util.ArrayList;

public class D_Delete {
	public void  D_txt(String TextName) throws IOException
	{
		File f = new File("D:\\SE_lastwork\\"+TextName+".txt");
		ArrayList<String> list = new ArrayList<>();
		FileInputStream fis = new FileInputStream(f);
		InputStreamReader isr =new InputStreamReader(fis,"UTF-8");
		BufferedReader br = new BufferedReader(isr);
		String line;
		while ((line = br.readLine()) != null) {
			list.add(line);
		}
		
				
		// 遍历集合
		System.out.println("------删除前--------");
		for (String s : list) {
			System.out.println(s);
		}
		
		//操作
		
		int C_numb=numb.user_numb();//行数

		list.remove(C_numb);
		
		// 遍历集合
				System.out.println("------删除后--------");
				for (String s : list) {
					System.out.println(s);
				}
		//保存操作
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
