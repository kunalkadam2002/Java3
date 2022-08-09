import java.util.*;
class p160{
   public static void main(String args[]){
	int a,n,cnt=0;
	Scanner d1=new Scanner(System.in);
	n=d1.nextInt();
	for( ;n!=0; ){
 	   a=n%10;
	   n=n/10;
	   cnt++;
	}
	System.out.println("the no of digits are :"+cnt);

   }
}