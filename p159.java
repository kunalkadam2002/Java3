import java.util.*;
class p159{
  public static void main(String args[]){
	int a,n,sum=0,x;
	Scanner d1=new Scanner(System.in);
	n=d1.nextInt();
	x=n;
	for( ; n!=0 ; ){
	a=n%10;
	n=n/10;
	sum=sum+a*a*a;
 	}
	if(x==sum)
	   System.out.println("the no is armstrong no");
	else 
	   System.out.println("the no is not armstrong no");
  }
}