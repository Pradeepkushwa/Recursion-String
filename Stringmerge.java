// wap to merge 2 strings alternately using recursion starting from the first input string
// input abcd,efgh         output:-  aebfcgdh
import java.util.Scanner;
public class Stringmerge {
    public static void main(String[] args) {
        System.out.println("Enter a first string");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("Enter a Second Strig");
        String s1=sc.nextLine();
      System.out.println(merge(s, s1));

    }
   public static String merge(String s,String s1){
            String ans="";
            if(s.length()==0){
                ans+=s;
                return ans;
            }
            if(s1.length()==0){
                ans+=s1;
                return ans;
            }
            ans+=s.substring(0,1);
            ans+=s1.substring(0,1);
            ans+=merge(s.substring(1,s.length()), s1.substring(1, s1.length()));
            return ans;
    }
    
}

