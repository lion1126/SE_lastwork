package com.info.S_T_C;

import java.io.IOException;
import java.util.Scanner;

import javax.xml.stream.events.StartDocument;

import com.CRUD.*;

public class Main {
	public static String selected_txt="";
	public static void main(String[] args) throws IOException { 		
		start();
		
	}
	
	public static void start() throws IOException
	{
		String u_putin=sysout("������ѧ����S������ʦ��T)���γ�(C)��������Ҫ���ĸ����в�����");
		selected_txt=u_putin+".txt";
		
		
		switch (u_putin) {
		case "S":
			Student student =new Student();
			student.second_select();
			break;
		case "C":
			Course course =new Course();
			course.second_select();
			break;
		case "T":
			Teacher teacher =new Teacher();
			teacher.second_select();
	break;

		default:
			System.out.println("�������>>>�����²�����");
			System.out.println("-------------------------");
			start();
			break;
		}
	}
	//ѯ���û�������������string����
	public static String sysout(String qustion)
	{		
		System.out.println(qustion);
		Scanner Sinput = new Scanner(System.in);
		String input=Sinput.next().toString();
		
		return input ;
	}

}


