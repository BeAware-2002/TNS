package mypack;

public class StaticBlock
{
  static String sentence;
  static int number;
  static
   {
        sentence = "Welcome ";
        number = 36;
   }
   public static void main(String args[])
   {
        System.out.println(sentence);
        System.out.println("Value of Integer: "+number);
   }
}

