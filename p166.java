class p166{
  public static void main(String args[]){
    int a,b,n,cnt;
  for(b=1;b<=100;b++){
     for(a=2,cnt=0;a<b;a++){
 	if(b%a==0)
                  cnt++;
     }
     if(cnt==0)
       System.out.println(b);
  }
}
 
}