import java.util.Scanner;

public class lefttriangle {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines : ");
        int n=sc.nextInt();
        for(int line=0;line<n;line++){
            for(int star=0;star<=line;star++){
                System.out.print("*");

            }
            System.out.println();

        }
    }
}    

