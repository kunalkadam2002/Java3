class p171{
   public static void main(String args[]){
     int a,b,n,sum;
        for(b=1;b<=1000;b++){
	    for(n=b,sum=0;n!=0;){
 	       a=n%10;
	       n=n/10;
	       sum=sum+ (a*a*a);
	    }
  	 if(b==sum)
 	     System.out.println(b);
        }

   }
}