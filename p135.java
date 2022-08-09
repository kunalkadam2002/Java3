import java.util.*;
class p135{
  public static void main(String args[]){
    int a,n,rev=0;
    Scanner d1=new Scanner(System.in);
    n=d1.nextInt();
    do{
      a=n%10;
      n=n/10;
      rev=rev*10+a;
    }while(n!=0);
     System.out.println("the rev no is :"+rev);

   }
}