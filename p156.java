import java.util.*;
class p156{
   public static void main(String args[]){
	int a,b,n,fact=1;
	Scanner d1=new Scanner(System.in);
	a=d1.nextInt();
	b=d1.nextInt();
	for(n=1;n<=b;n++){
	fact=fact*a;
	}
	System.out.print("the power factor is :"+fact);

   }
}