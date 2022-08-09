class p169{
   public static void main(String args[]){
     int a,b,n,rev;
    for(b=225;b<=245;b++){
        for(rev=0,n=b ; n!=0;){
            a=n%10;
            n=n/10;
            rev=rev*10+a;
        }
       System.out.println( b+"     "+rev);
   }
}
}