package project;

public class Member_bmi {
   public static void main(String[] args) {
      System.out.println("[비만도 측정 중 ....]");
      
      int w = 72;  // 회원가입에서 체중 가져오기
      int h = 169; // 회원가입에서 키 가져오기
      
      bmi(w, h);  // bmi 메소드
   }
   
   public static void bmi(int w, int h) {
      System.out.println("현재 키와 몸무게는 " + h + "cm" + ", " + w + "kg 입니다.");
      
      double nomalWeight = (h - 100) * 0.9;  // 표준 체중 계산 공식
      System.out.println("표준 체중은 " + nomalWeight + "입니다.");
      
      double fatnessWeight = (w / nomalWeight) * 100; //비만도 계산 공식
      System.out.println("BMI 계산 값: " + fatnessWeight);
      
      if(fatnessWeight < 90 ) {
         System.out.println("BMI 측정: 저체중 입니다.");
      } else if(fatnessWeight >= 90 && fatnessWeight < 110) {
         System.out.println("BMI 측정: 표준 입니다.");
      } else if(fatnessWeight >= 100){
         System.out.println("BMI 측정: 과체중 입니다.");
      } else {
         System.out.println("BMI 측정: 다시 입력해주세요");
      }
   }
}