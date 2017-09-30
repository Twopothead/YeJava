import java.util.Scanner;
import java.io.*;
class Prime{
  static int A[]= new int[200];
      public static boolean JudgePrime(int num){
              boolean judge=true;
              int j=2;
                  do{
                        if(num%j==0&&num!=j)
                        judge = false;
                        j++;
                    }while(j<=Math.sqrt(num));
                 return judge;
      }
      public static void main(String args[]) 	{
               int n=0;
               /*
               First_Loop:
               for(int i=2;i<1000;i++){
                 	    for(int j=2;j<=Math.sqrt(i);j++){
                        if(i%j==0)
                        continue First_Loop;
                      }
                  A[n++]=i;
                 System.out.print(i+"\t");
                 System.out.println(n);
             }  //for
             */
            int i=2,j=2;
            int k=1;
           System.out.println("使用判别函数的方法找素数:");
             do{
                 if(JudgePrime(i)){
                  System.out.print(i+"\t");
                 if(k%10==0)System.out.println();k++;
               }
                 i++;
            }while(i<1000);
            System.out.println("\n\n两个do while 的方法找素数:");
              int a=2,b=2;
              k=1;
              boolean flag=true;
             do{
                  flag=true;
                  b=2;
              do{
                  if(a%b==0&&a!=b)flag=false;
                  b++;
              }while(b<=Math.sqrt(a));
              if(flag){
              System.out.print(a+"\t");
                if(k%10==0)System.out.println();
                k++;
              }
              a++;
           }while(a<1000);
           System.out.println();
    } //main
}
