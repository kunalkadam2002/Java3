import java.util.*;
class p162{
   public static void main(String args[]){
      int a,n,cnt=0;
     Scanner d1=new Scanner(System.in);
     n=d1.nextInt();
 
    for(a=2;a<n;a++){
      if(n%a==0)
         cnt++;
    }
     if(cnt==0)
         System.out.println("the no is prime");
     else
         System.out.println("the no is not prime");
}

}