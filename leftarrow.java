import java.util.Scanner;

public class leftarrow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines : ");
        int n=sc.nextInt(); 
        //uper part
        for(int line=1;line<n;line++){
            for(int space=1;space<=n-line;space++){
                System.out.print(" ");
            }
            for(int star=line;star<=n;star++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower part
        for(int line=1;line<=n;line++){
            for(int space=1;space<line;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
