package com.CRUD;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class U_Update {
	public void U_txt(String TxtName) throws IOException
	{
		File f = new File("D:\\SE_lastwork\\"+TxtName+".txt");
		ArrayList<String> list = new ArrayList<>();
		FileInputStream fis = new FileInputStream(f);
		InputStreamReader isr =new InputStreamReader(fis,"UTF-8");
		BufferedReader br = new BufferedReader(isr);
		String line;
		while ((line = br.readLine()) != null) {
			list.add(line);
		}			
		// ��������
		System.out.println("------�޸�ǰ--------");
		for (String s : list) {
			System.out.println(s);
		}
		
		//��������
		int C_numb=numb.user_numb();
		String C_line=numb.user_change();
		//System.out.println(C_line);
		list.add(C_numb, C_line);
		list.remove(C_numb+1);
		
		// ��������
				System.out.println("------�޸ĺ�--------");
				for (String s : list) {
					System.out.println(s);
				}
		//�����޸�
				
		FileOutputStream writerStream = new FileOutputStream(f); 
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(writerStream, "UTF-8")); 		

		//BufferedWriter writer = new BufferedWriter(new FileWriter(f));
		for (int i = 0; i < list.size(); i++) {
			String str =list.get(i);
			writer.write(str);	
			writer.newLine();
		}

	    writer.close();					
		br.close();
	}
}
