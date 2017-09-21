class Bubble{
      public static void main(String[] args){
          int []A={5,4,3,2,1};
          int a,b;
          int size=5;
          System.out.println("Original Array is:");
          for(int i=0;i<5;i++){System.out.print(A[i]+" ");}
          System.out.println();
          for(a=1;a<size;a++){
              for(b=size-1;b>=a;b--){
                  if(A[b-1]>A[b]){
                        A[b]=A[b-1]^A[b];
                        A[b-1]=A[b-1]^A[b];
                        A[b]=A[b-1]^A[b];
                        }
                  }
          }
        System.out.println("Sorted Array is (Bubble Sort):");
        for(int i=0;i<5;i++)
        System.out.print(A[i]+" ");
        System.out.println();
      }
}
