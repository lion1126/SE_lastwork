package com.CRUD;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class B_BackUp {
	public void backup(String TxtName) throws IOException 
	{
		String source = "D:\\SE_lastwork\\"+TxtName+".txt";
		String target = "D:\\SE_lastwork\\beifen_"+TxtName+".txt";
		try {
			File f = new File("D:\\SE_lastwork\\beifen_"+TxtName+".txt");
			f.delete();
			FileInputStream fis = new FileInputStream(new File(source));
			InputStreamReader in = new InputStreamReader(fis, "UTF-8");			
			BufferedReader bin =new BufferedReader(in);
			Scanner input = new Scanner(bin);
			PrintWriter output = new PrintWriter(new File(target));	
			System.out.println("-----备份内容-----");
			while (input.hasNext()) {
				String s1 = input.nextLine();
				String s2 = s1.replaceAll("000", "***");
				output.println(s2);				
				System.out.println(s2);
			}
			System.out.println("文件备份成功！");
			input.close();
			output.close();	
		} catch (FileNotFoundException e) {
			System.out.println("文件备份失败！");
		}
	}
}

