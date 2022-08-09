import java.util.*;
class p163{
   public static void main(String args[]){
	int n1,n2,a,gcd=1,n;
	Scanner d1=new Scanner(System.in);
	n1=d1.nextInt();
	n2=d1.nextInt();
	if(n1>n2)
 	   n=n1;
	else 
	   n=n2;
	for(a=1;a<n;a++){
                  if(n1%a==0 && n2%a==0){
	      gcd=a; 
	    }	   
	}
	  System.out.println("the gcd is :"+gcd);

  }

}