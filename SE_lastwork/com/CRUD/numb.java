package com.CRUD;
import java.util.Scanner;

import com.info.S_T_C.*;
public class numb {

	public static int user_numb()
	{
		return(sysoutint("请输入要操作的行数："));
		
	}
	public static String user_change()
	{
		return(sysoutstr("请输入要修改的内容："));
	 
	}
	
	//询问用户操作，并返回int内容
		public static int sysoutint(String qustion)
		{		
			System.out.println(qustion);
			Scanner Sinput = new Scanner(System.in);
			int input=Sinput.nextInt();			
			return input ;
		}
		//询问用户操作，并返回string内容	整行
		public static String sysoutstr(String qustion)
		{		
			
			System.out.println(qustion);
			Scanner Sinput = new Scanner(System.in);
			String input=Sinput.nextLine().toString();
			
			return input ;
		}
}
