import java.util.*;
class p164{
   public static void main(String args[]){
     int a,n1,n2,n,lcd=1;
     Scanner d1=new Scanner(System.in);
    n1=d1.nextInt();
    n2=d1.nextInt();
    if(n1>n2)
       n=n1;
    else 
       n=n2;
  
   for(a=n;a>1;a--){
     if(n1%a==0 && n2%a==0)
           lcd=a;
   
    }
     System.out.println("the lcd is :"lcd);

   }
}