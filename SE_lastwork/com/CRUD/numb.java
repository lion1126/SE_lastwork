package com.CRUD;
import java.util.Scanner;

import com.info.S_T_C.*;
public class numb {

	public static int user_numb()
	{
		return(sysoutint("������Ҫ������������"));
		
	}
	public static String user_change()
	{
		return(sysoutstr("������Ҫ�޸ĵ����ݣ�"));
	 
	}
	
	//ѯ���û�������������int����
		public static int sysoutint(String qustion)
		{		
			System.out.println(qustion);
			Scanner Sinput = new Scanner(System.in);
			int input=Sinput.nextInt();			
			return input ;
		}
		//ѯ���û�������������string����	����
		public static String sysoutstr(String qustion)
		{		
			
			System.out.println(qustion);
			Scanner Sinput = new Scanner(System.in);
			String input=Sinput.nextLine().toString();
			
			return input ;
		}
}
