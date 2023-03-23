import java.util.*;
public class IsSame{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int y = scan.nextInt();
    if(isEqual(x,y)
      System.out.println(x+" and "+y+" are same");
    else System.out.println(x+" and "+y+" are not same");   
  }
  public static boolean isEqual(int x, int y){
      if(x==y) return true;
      else return false;
  }
}
