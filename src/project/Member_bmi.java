package project;

public class Member_bmi {
   public static void main(String[] args) {
      System.out.println("[�񸸵� ���� �� ....]");
      
      int w = 72;  // ȸ�����Կ��� ü�� ��������
      int h = 169; // ȸ�����Կ��� Ű ��������
      
      bmi(w, h);  // bmi �޼ҵ�
   }
   
   public static void bmi(int w, int h) {
      System.out.println("���� Ű�� �����Դ� " + h + "cm" + ", " + w + "kg �Դϴ�.");
      
      double nomalWeight = (h - 100) * 0.9;  // ǥ�� ü�� ��� ����
      System.out.println("ǥ�� ü���� " + nomalWeight + "�Դϴ�.");
      
      double fatnessWeight = (w / nomalWeight) * 100; //�񸸵� ��� ����
      System.out.println("BMI ��� ��: " + fatnessWeight);
      
      if(fatnessWeight < 90 ) {
         System.out.println("BMI ����: ��ü�� �Դϴ�.");
      } else if(fatnessWeight >= 90 && fatnessWeight < 110) {
         System.out.println("BMI ����: ǥ�� �Դϴ�.");
      } else if(fatnessWeight >= 100){
         System.out.println("BMI ����: ��ü�� �Դϴ�.");
      } else {
         System.out.println("BMI ����: �ٽ� �Է����ּ���");
      }
   }
}