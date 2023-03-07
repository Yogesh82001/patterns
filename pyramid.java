import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines : ");
        int n=sc.nextInt(); 
        int totalspace=n-1;
        for(int line=1;line<=n;line++){
            for(int space=totalspace;space>=1;space--){
                System.out.print(" ");

            }
            for(int star=1;star<=line;star++){
                System.out.print("* ");
            }
            totalspace--;
            System.out.println();

        }
    }
    
}
