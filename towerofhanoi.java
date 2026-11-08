// import java.util.Scanner;
// public class towerofhanoi{
//     public static void solvetoh(int n, int t1, int t2, int t3){
//         // base case: if amount of discs is 0 then return
//         if(n==0){
//             return;
//         }
//         //move disc from t1 to t3 using t2 as auxillary
//         solvetoh(n-1, t1, t3, t2);
//         //move nth disc from t1 to t2
//         System.out.println("move disc "+n+" from tower "+t1+" to tower "+t2);
//         //move disc from t3 to t2 using 1 as an auxillary
//         solvetoh(n-1, t3, t2, t1);
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         //get input from user
//         System.out.println("enter the number of discs: ");
//         int n=sc.nextInt();
//         //user inupt numbers of each tower
//         System.out.println("enter the number for the first tower: ");
//         int t1=sc.nextInt();
//         System.out.println("enter the number for the second tower: ");
//         int t2=sc.nextInt();
//         System.out.println("enter the number for the third tower: ");
//         int t3=sc.nextInt();
//         //call method to solve tower of hanoi
//         solvetoh(n, t1, t2, t3);
//     }
// }
public class towerofhanoi{
    public static void solve(int n, int t1, int t2, int t3){
        if(n==0){
            return;
        }
        solve(n-1, 1, 3, 2);
        System.out.println("move disc "+n+" from tower "+t1+" to tower "+t2);
        solve(n-1, 3, 2, 1);
    }
    public static void main(String[] args){
        solve(6, 1, 2, 3);
    }
}