package com.info.S_T_C;
import java.io.*;
import java.util.ArrayList;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import com.CRUD.*;
public  class Course {
	public static String name="C";	
	public void second_select() throws IOException {
		
		String selected_opreation=Second.select_operation();
		switch (selected_opreation) {
		case "C":
			C_zengjia();
			break;
		case "R":
			R_chaxun();
			break;
		case "U":
			U_xiugai();
			break;
		case "D":
			D_shanchu();
			break;
		case "B":
			B_beifen();
			break;
		default:
			break;
		}
	}
		
	public void B_beifen() throws IOException {
		//����
		B_BackUp b_BackUp=new B_BackUp();
		b_BackUp.backup(this.name);
		
	}
	public void R_chaxun() throws IOException {
		//��ѯ
		R_Retrieve r_Retrieve =new R_Retrieve();
		r_Retrieve.R_txt(this.name);
		
	}
	

	
	public void C_zengjia() throws IOException {
		//����
		C_Create c_Create =new C_Create();
		c_Create.C_txt(this.name);
		
	}
	
	
	public void D_shanchu() throws IOException {
		//ɾ��
		D_Delete d_Delete=new D_Delete();
		d_Delete.D_txt(this.name);
	}
	
	
	public void U_xiugai() throws IOException {
		//�޸�
		U_Update u_Update=new U_Update();
		u_Update.U_txt(this.name);
	}
	
}
