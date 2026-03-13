//Longest Substring Without Repeating Characters
//s = "abcabcbb"
import java.util.*;
public class Question1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the String");
        String s=sc.nextLine();
        
        System.out.println(solve(s));
    }
    static int solve(String s){
        int n=s.length();
        int i=0;
        int j=0;
        int ans=0;
        HashSet<Character>uset=new HashSet<>();
        while(j<n){
            if(uset.contains(s.charAt(j))){
                while(uset.contains(s.charAt(j))){
                    uset.remove(s.charAt(j));
                    i++;
                }
            }
            
            uset.add(s.charAt(j));
            ans=Math.max(ans,j-i+1);
            j++;
        }
        
        return ans;
    }
}