import java.util.Scanner;
import java.util.HashMap;
class Alphabet_Stat{

      public static void main ( String args[] ){
          System.out.println("请输入一段英文：");
          Scanner scanner=new Scanner(System.in);
          String input=scanner.next();
          String regex = "(?i)[^a-z]";
          String result = input.replaceAll (regex, "");
          System.out.println (result);
          HashMap<String, Integer> map = new HashMap<String, Integer> ();
          for ( int i = 0; i < result.length (); i++ )  {
              String one = result.charAt (i) + "";
              if (map.get (one)==null)  map.put (one, 1);
              else
                  map.put (one, map.get (one) + 1);
          }
          System.out.println (map);
  }
}
