package project;

import java.util.Scanner;

public class MemberLogin {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MemberInfo info = new MemberInfo();
        while (true) {
            char select = info.display();
            
            switch (select) {
            case '1':
                info.loginVaild();
                if (MemberInfo.loginFlag) {
                    break;
                }
                System.out.print("���̵� �Է� :");
                String myId = input.nextLine();
                info.setId(myId);
                System.out.print("��й�ȣ �Է� : ");
                String myPw = input.nextLine();
                info.setPassword(myPw);
                info.isMemberCheck(info.getId(), info.getPassword());
                break;
            case '2':
                info.Join();
                break;
            case '3':
                info.logout();
                break;
            case '4':    
                System.exit(0);
            default:
                System.out.println("�߸��� �� �Է�");
                break;
            }
        }
 
    }
}
