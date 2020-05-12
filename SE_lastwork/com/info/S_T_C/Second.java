package com.info.S_T_C;

import java.io.IOException;

public class Second {
	public static String  select_operation() throws IOException {
		String u_operation=Main.sysout("你要对其进行查询（R），增加（C），修改（U），删除（D）,备份（B)？");

		if(u_operation.equals("R")||u_operation.equals("C")||
				u_operation.equals("U")||u_operation.equals("D")||u_operation.equals("B"))
		{
			return u_operation;
		}
		
		else {
			System.out.println(u_operation);
			System.out.println("输入错误>>>请重新操作。");
			System.out.println("-------------------------");
			
			return select_operation();
		}
	}
}
