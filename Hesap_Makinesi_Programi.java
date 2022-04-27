package HesapMakinesiProgrami;
import java.util.Scanner;

public class Hesap_Makinesi_Programi {
  public static void main(String[] args) {
      int num1, num2, islem;
      Scanner input = new Scanner(System.in);

      System.out.println("HESAP MAKİNESİ BAŞLATILIYOR");
      System.out.println("___________________________________________________");
      
      try{
      System.out.print("1.sayıyı giriniz : ");
      num1 = input.nextInt();
      System.out.print("2.sayıyı giriniz : ");
      num2 = input.nextInt();
      System.out.print("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme\nYapılacak işlemi seçmek için sayısını giriniz : ");
      islem = input.nextInt();  
      }finally{input.close();}

      switch (islem) {
          
          case 1:
              System.out.println("Yanıt : "+ (num1 + num2));
              break;
            
          case 2:
               System.out.println("Yanıt : "+ (num1 - num2)); 
               break;

          case 3:    
                System.out.println("Yanıt : "+(num1 * num2));
                break;

          case 4:
                if(num2 == 0){
                 System.out.println("Sayıların 0'a bölümü tanımsızdır!");
                 System.out.println("0'dan farklı bir sayı giriniz.");
                }     
                else
                    System.out.println("Yanıt : "+(num1 / num2));
                break; 
           
          default:
                System.out.println("Hatalı bir tuşlama yaptınız!");
              break;  
      }
      
      System.out.println("______________________________________");
      System.out.println("HESAP MAKİNESİ KAPATILIYOR");     
  }  
}
