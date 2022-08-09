import java.util.*;
class p154{
    public static void main(String args[]){
	int a,n,fact=1;
	Scanner d1=new Scanner(System.in);
	System.out.print("enter any no :");
	n=d1.nextInt();
	for(a=1;a<=n;a++){
	   fact=fact*a;
	}
 	System.out.println("Factorial ="+fact);


    }
}