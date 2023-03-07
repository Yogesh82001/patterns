import java.util.Scanner;

public class leftdiagnoal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines : ");
        int n=sc.nextInt(); 
        int totalstar=1;
        for(int line=1;line<=n;line++){
            for(int space=2;space<=line;space++){
                System.out.print(".");
            }
            for(int star=1;star<=totalstar;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
