package project;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameSetting extends JFrame{
	FrameSetting() {
		
		setSize(400, 400); // 창 사이즈 설정
		setResizable(false); // 창 사이즈 변경 불가
		setLocationRelativeTo(null); // 윈도우 화면 가운데 창 실행하기
		setVisible(true); // 창 띄우기
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 창을 끄면 프로그램 종료
	}
	
	public JButton() {
		JButton  btn1 = new JButton(); //btn1이라는 버튼 생성
		add(btn1); // btn1을 추가
		
	}
}
