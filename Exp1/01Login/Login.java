import java.util.Scanner;
class Login{
  public static void main(String[] args){
          System.out.println("请输入登录名：");
          Scanner scanner=new Scanner(System.in);
          String username=scanner.next();
          System.out.println("你的登录名是："+username);
          String password;
          System.out.println("请输入密码：");
          password=scanner.next();
          if((username.equals("qiuri"))&&(password.equals("123456")))
          System.out.println(username+",恭喜你，登录成功！");
          else
          System.out.println(username+",对不起，登录失败！");
        }
}
