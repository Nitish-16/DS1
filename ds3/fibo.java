import java.util.*;
class fibonacci {
  public int fib(int n)
  {
    if(n<=1)
    return n;
    return fib(n-1)+fib(n-2);
  }
  public static void main(String[] args) {
    fibonacci m=new fibonacci();
    int n,i,num;
    Scanner o=new Scanner(System.in);
    System.out.println("enter nth term of fibbonacci series");
    n=o.nextInt();
    int a=m.fib(n);
    System.out.println("term is: "+a);
    
  }
}