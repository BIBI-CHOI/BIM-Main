package project;

	import java.util.Scanner;

	public class BMI {

	   public static void main(String[] args) {
	      Scanner scan =new Scanner(System.in);
	      
	      
	      StartUi();                     //회원가입 ui출력
	      System.out.println("               >");
	      int num = scan.nextInt();
	      
	      switch(num) {
	      
	      case 2:
	    	  System.out.println("          회원가입 얼른와요!                 \n");
	    	  System.out.println();
	         // 회원가입 메소드 호출
	         // 회원가입이후에 로그인 메소드 호출 
	         break;
	      case 1:
	    	  System.out.println("          로그인 어서오세요                  \n");
	    	  System.out.println();
	         // 로그인 메소드 호출
	         break;
	      case 0:
	    	  System.out.println("잘가요 ㅠㅠ ");
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
	   
	   // 기능 선택 첫화면 메소드
	   public static void StartUi() {
	      // cmd창 명령어 안보이게하는 줄간격
	      for(int i =0; i<20; i++) {
	         System.out.println();
	         
	      }
	      System.out.printf("                                      \n");
	        System.out.printf("        ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n");
	        System.out.printf("                                      \n");
	        System.out.printf("         [비만도 테스트 version 1.0.5®]   \n");
	        System.out.printf("                                      \n");
	        System.out.printf("        ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n");
	        System.out.printf("                                      \n");
	        System.out.printf("                                      \n");
	        System.out.printf("                                      \n");
	        System.out.printf("          2 → 회원가입                                    \n");
	        System.out.printf("          1 → 로그인                                       \n");
	        System.out.printf("          0 → 종료                                          \n");
	        System.out.printf("                                      \n");
	        System.out.printf("                                      \n");
	      
	      
	      
	      
	   }

	}

