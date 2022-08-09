import java.util.*;
class p167{
  public static void main(String args[]){
    int a,n,b,cnt;
    Scanner d1=new Scanner(System.in);
    n=d1.nextInt();
    for(b=2;b<=n;b++){
     	for(a=2,cnt=0;a<b;a++){
	   if(b%a==0)
	    cnt++;
     	}
	if(cnt==0)
	 System.out.println(b);
  }


}



}