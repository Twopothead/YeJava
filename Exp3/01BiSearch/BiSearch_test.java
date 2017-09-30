public class BiSearch_test {
public static int []numbers={1,2,3,4,5,6,7,8,9,10};
  public static boolean BiSearch(int number) {
      int middle;
      int left=0;
      //int right=numbers.length-1;
      int right=9;
      while(left<=right){//注意这里是left<=right，不是!=
          middle=(left+right)/2;
          if(number==numbers[middle])return true;
          else {
              if(number>numbers[middle]) left=middle+1;
              if(number<numbers[middle]) right=middle-1;
          }
      }
          return false;
  }
public static void test(int number){
      if(BiSearch(number))System.out.println(number+" found ");
        else System.out.println(number+" not found ");
}
public static void main(String[] args) {
      System.out.println("numbers:");
      for(int i=0; i<numbers.length; i++){
          System.out.print(numbers[i]+"\t");
      }
      System.out.println();
      for(int i=0;i<20;i++)test(i);
      }

}
