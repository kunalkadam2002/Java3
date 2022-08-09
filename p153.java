import java.util.*;
class p153{
    public static void main(String args[]){
	int a,n,sum=0;
	Scanner d1=new Scanner(System.in);
	System.out.print("enter any no :");
	n=d1.nextInt();
	for(a=1;a<=n;a++){
	   System.out.print(a+"+");
	   sum=sum+a;
	}
 	System.out.println("\b="+sum);
    }
}