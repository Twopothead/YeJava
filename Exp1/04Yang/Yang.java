class Yang{
      public static void main(String args[]){
            int [][]A=new int[10][10];
            int i,j;
            for(i=0;i<10;i++){
              A[i][0]=1;
              A[i][i]=1;
            }
            for(i=2;i<10;i++){
                for(j=1;j<=i;j++){
                  A[i][j]=A[i-1][j]+A[i-1][j-1];
                }
            }
            for(i=0;i<10;i++){
                for(j=0;j<10;j++){
                  //if(A[i][j]!=0)System.out.print(A[i][j]+" ");
                  if(A[i][j]!=0)System.out.printf("%5d ",A[i][j]);
                }
                System.out.println();
            }
            System.out.println("");
    }
}
