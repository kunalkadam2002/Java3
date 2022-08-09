import java.util.*;
class p168{
   public static void main(String args[]){
     int a,b,n,sum;
     Scanner d1=new Scanner(System.in);
     n=d1.nextInt();
  for(b=1;b<n;b++){
      for(a=1,sum=0;a<b;a++){
	if(b%a==0)
	    sum=sum+a;
      }
      if(sum==b)
        System.out.println(b);
   }
}
}