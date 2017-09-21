class Diamond{
          public static void main(String[] args){
          int size= 9;
          int i,j,k;
          for(i=0;i<size;i++){
                for(j=0;j<size-i;j++){
                  System.out.print(" ");
                }
                System.out.print("*");
                for(k=0;k<2*i-1;k++)System.out.print(" ");
                if(i!=0)System.out.print("*");
                System.out.println("");
          }
          for(i=0;i<size-1;i++){
                System.out.print(" ");
                for(j=0;j<=i;j++){
                    System.out.print(" ");
                  }
                System.out.print("*");
                for(k=0;k<2*size-5-2*i;k++)System.out.print(" ");
                if(i!=size-2)System.out.print("*");
                System.out.println();
          }
    }
}
