import java.util.Scanner;

public class numberlefttriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines : ");
        int n=sc.nextInt(); 
        int count=1;
        for(int line=1;line<=n;line++){
            for(int star=1;star<=line;star++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    
}
