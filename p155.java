import java.util.*;
 class p155{
  public static void main(String args[]){
	int a,b,n,sum=0;
	Scanner d1=new Scanner(System.in);
	a=d1.nextInt();
	b=d1.nextInt();
	for(n=1;n<=b;n++){
	  sum=sum+a;
	}
	System.out.println("multiplication is :"+sum);
  }
}