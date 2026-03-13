// Kth Largest Element
// Input
// arr = [3,2,1,5,6,4]
// k = 2

// Output
// 5
import java.util.*;

public class Question3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the Size");
        int n=sc.nextInt(); 
        ArrayList<Integer>arr=new ArrayList<>();
        
        System.out.println("Enter the array");
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        
        System.out.println("Enter the kth");
        int k=sc.nextInt();
        
        System.out.println(solve(arr,k,n));
    }
    static int solve(ArrayList<Integer>arr,int k,int n){
        PriorityQueue<Integer>q=new PriorityQueue<>(Collections.reverseOrder());//MAX HEAP
        
        for(int i=0;i<n;i++){
            q.add(arr.get(i));
        }
        
        k--;
        while(k>0){
            q.poll();
            k--;
        }
        
        return q.peek();
    }
}