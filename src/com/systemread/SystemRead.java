package com.systemread;

import java.io.IOException;

public class SystemRead {

	public static void main(String[] args) throws IOException {
		char ch;
		System.out.println("������һ���ַ���");
		ch = (char) System.in.read(); //�Ӽ��̶���һ���ַ�
		System.out.println("��������ַ�Ϊ��" + ch); //������ַ�
	}
}
