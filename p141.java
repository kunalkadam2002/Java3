import java.util.*;
class p141{
   public static void main(String args[]){
      int a,b,lcd=1,n;
      Scanner d1=new Scanner(System.in);
      a=d1.nextInt();
      b=d1.nextInt();
      n=a;
      do{
         if(a%n==0 && b%a==0){
         lcd=n;
         }
         n--;
      }while(n>1);
       System.out.println("The LCD is :"+lcd);
   }


}