import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        if(!sc.hasNextLine()) return ;
        String str1=sc.nextLine();
        
        if(!sc.hasNextLine()) return ;
        String str2=sc.nextLine();
        String[] words=str1.split("[^a-zA-Z0-9]+");
        int count=0;
        for(String word: words){
            if(word.equals(str2)){
                count++;
            }
        }
        System.out.println(count);
    }
}
