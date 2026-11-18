import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        if(!sc.hasNextLine()) return;
        String text=sc.nextLine();
        if(!sc.hasNextLine()) return ;
        String pattern=sc.nextLine();
        if(!sc.hasNextLine())return;
        String replacement=sc.nextLine();
        String result=text.replace(pattern,replacement);
        System.out.println(result);
    }
}
