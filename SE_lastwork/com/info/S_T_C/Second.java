package com.info.S_T_C;

import java.io.IOException;

public class Second {
	public static String  select_operation() throws IOException {
		String u_operation=Main.sysout("��Ҫ������в�ѯ��R�������ӣ�C�����޸ģ�U����ɾ����D��,���ݣ�B)��");

		if(u_operation.equals("R")||u_operation.equals("C")||
				u_operation.equals("U")||u_operation.equals("D")||u_operation.equals("B"))
		{
			return u_operation;
		}
		
		else {
			System.out.println(u_operation);
			System.out.println("�������>>>�����²�����");
			System.out.println("-------------------------");
			
			return select_operation();
		}
	}
}
