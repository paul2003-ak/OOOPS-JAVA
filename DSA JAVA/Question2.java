// Valid Parentheses (Stack)
// Input
// "({[]})"

// Output
// true

import java.util.*;
public class Question2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        
        System.out.println(solve(s));
    }
    static boolean solve(String s){
        Stack<Character>st=new Stack<>();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
            }
            else{
                if(st.isEmpty()){
                 return false;
                }
                if((c==')' && st.peek()!='(') ||
                    (c=='}' && st.peek()!='{')||
                    (c==']' && st.peek()!='[')){
                return false;
                }
                
                st.pop();
            }
        }
        
        return true;
    }
}