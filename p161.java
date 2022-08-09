import java.util.*;
class p161{
   public static void main(String args[]){
     int n,a,rev=0;
     Scanner d1=new Scanner(System.in);
     n=d1.nextInt();
     for( ; n!=0; ){
      a=n%10;
      n=n/10;
      rev=rev*10+a;
     }
  
     System.out.println("In words :");
     n=rev;
     for( ; n!=0 ;){
       a=n%10;
        if(a==0)
          System.out.println("zero");
        else if(a==1)
          System.out.println("one");
        else if(a==2)
          System.out.println("two");
        else if(a==3)
          System.out.println("three");
        else if(a==4)
          System.out.println("four");
        else if(a==5)
          System.out.println("five");
        else if(a==6)
          System.out.println("six");
        else if(a==7)
          System.out.println("seven");
        else if(a==8)
          System.out.println("eight");
        else if(a==9)
          System.out.println("nine");
 
        n=n/10;
 
      }

   }
}