package com.stroz.entity;

public enum UserRole {
	user,admin,superadmin;
	private String role="";
	public void setRole(String role){
		switch (role) {
		case "normal":
			this.role=UserRole.user.toString();
			break;
		case "admin":
			this.role=UserRole.admin.toString();;
			break;
		default:
			System.out.println("��ɫȨ������ʹ��Ĭ��Ȩ�ޣ�");
			this.role=UserRole.user.toString();
			break;
		}
	}
	public String getRole(){
		return this.role;
	}
	
}
