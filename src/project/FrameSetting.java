package project;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameSetting extends JFrame{
	FrameSetting() {
		
		setSize(400, 400); // â ������ ����
		setResizable(false); // â ������ ���� �Ұ�
		setLocationRelativeTo(null); // ������ ȭ�� ��� â �����ϱ�
		setVisible(true); // â ����
		setDefaultCloseOperation(EXIT_ON_CLOSE); // â�� ���� ���α׷� ����
	}
	
	public JButton() {
		JButton  btn1 = new JButton(); //btn1�̶�� ��ư ����
		add(btn1); // btn1�� �߰�
		
	}
}
