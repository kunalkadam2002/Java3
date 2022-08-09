import java.util.*;
class p157{
   public static void main(String args[]){
     int n,a,rev=0;
     Scanner d1=new Scanner(System.in);
     System.out.println("enter no :");
     n=d1.nextInt();
     for( ; n!=0 ; ){
      a=n%10;
      n=n/10;
      rev=rev*10+a;
    }
    System.out.println("reverse no is :"+rev);


   }




}