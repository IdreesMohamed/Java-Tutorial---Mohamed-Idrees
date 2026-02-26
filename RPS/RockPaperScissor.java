package RPS;
import java.util.*;
public class RockPaperScissor {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    HashMap<Integer,String> map=new HashMap<>();
    map.put(0,"rock");
    map.put(1,"paper");
    map.put(2,"scissor");

    System.out.println("Enter an option: 1.rock  2.paper  3.scissor");
    String s=sc.nextLine();
    String str=s.toLowerCase();

    if(str.equals("rock")||str.equals("scissor")||str.equals("paper")){
    int x=(int) (Math.random() *3);
    String ss=map.get(x);

    System.out.println("You chose: "+ str);
    System.out.println("Computer chose: "+ ss);

    if(str.equals(ss)){
      System.out.println("Its an tie");
    }

    else if(str.equals("rock")&&ss.equals("scissor")||str.equals("paper")&&ss.equals("rock")||str.equals("scissor")&&ss.equals("paper")){
      System.out.println("You Win");
    }
    else{
      System.out.println("You Lose");
    }
   }
   else{
      System.out.println("Incorrect Input");
   }
   } 
}
