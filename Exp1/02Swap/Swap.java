class Swap{
    public static void main(String[] args){
          int A=2;
          int B=5;
          System.out.println("Raw A and B:");
          System.out.println("A:"+A+",B:"+B);
          A=A^B;
          B=B^A;
          A=A^B;
          System.out.println("Swap A and B:");
          System.out.println("A:"+A+",B:"+B);
    }
}
