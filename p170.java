class p170{
  public static void main(String args[]){
    int a,b,u,rev,i;
       for(b=200;b<=300;b++){
	  for(rev=0,u=b,i=u;u!=0; ){
	      a=u%10;
	      u=u/10;
	      rev=rev*10+a;	   
	   }
	 if(rev==i)
                    System.out.println(b);

       }
  
   }


}