package com.CRUD;

import java.io.*;
import com.info.S_T_C.*;

public class R_Retrieve {
	
	
	//��ѯĳ�ĵ�����ӡ
	public  void R_txt(String WordName) throws IOException {

		File f = new File("D:\\SE_lastwork\\"+WordName+".txt");		
		FileInputStream fis = new FileInputStream(f);
		InputStreamReader in = new InputStreamReader(fis, "UTF-8");
		
		BufferedReader bin =new BufferedReader(in);
		int b = 0;
		while((b = bin.read()) != -1){
		  System.out.print((char)b);
		}
		bin.close();
	}
	
	//��ѯĳ�е�����
	public void R_line(int WordLine) {
		
	}
	
	
}
