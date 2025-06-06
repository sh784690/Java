import java.util.Scanner;
class swapping{
    public static void main(String[] args){ 
        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter The number a- ");
        int a= sc.nextInt();
        System.out.print("Enter The number b- "); 
        int b= sc.nextInt();
        a = b;
        int temp = a; 
        b = temp; 
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b); 
    }
}