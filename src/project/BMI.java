package project;

	import java.util.Scanner;

	public class BMI {

	   public static void main(String[] args) {
	      Scanner scan =new Scanner(System.in);
	      
	      
	      StartUi();                     //ȸ������ ui���
	      System.out.println("               >");
	      int num = scan.nextInt();
	      
	      switch(num) {
	      
	      case 2:
	    	  System.out.println("          ȸ������ �󸥿Ϳ�!                 \n");
	    	  System.out.println();
	         // ȸ������ �޼ҵ� ȣ��
	         // ȸ���������Ŀ� �α��� �޼ҵ� ȣ�� 
	         break;
	      case 1:
	    	  System.out.println("          �α��� �������                  \n");
	    	  System.out.println();
	         // �α��� �޼ҵ� ȣ��
	         break;
	      case 0:
	    	  System.out.println("�߰��� �Ф� ");
	    	  System.exit(0);
	         break;
	      }
	      
//	      MemberInfo app = MemberLogin();
//	      
//	      app.init();
//	      
//	      app.start();
//	      
//	      scan.close();
	   }
	   
	   // ��� ���� ùȭ�� �޼ҵ�
	   public static void StartUi() {
	      // cmdâ ��ɾ� �Ⱥ��̰��ϴ� �ٰ���
	      for(int i =0; i<20; i++) {
	         System.out.println();
	         
	      }
	      System.out.printf("                                      \n");
	        System.out.printf("        �������������������������������\n");
	        System.out.printf("                                      \n");
	        System.out.printf("         [�񸸵� �׽�Ʈ version 1.0.5��]   \n");
	        System.out.printf("                                      \n");
	        System.out.printf("        �������������������������������\n");
	        System.out.printf("                                      \n");
	        System.out.printf("                                      \n");
	        System.out.printf("                                      \n");
	        System.out.printf("          2 �� ȸ������                                    \n");
	        System.out.printf("          1 �� �α���                                       \n");
	        System.out.printf("          0 �� ����                                          \n");
	        System.out.printf("                                      \n");
	        System.out.printf("                                      \n");
	      
	      
	      
	      
	   }

	}

