import java.util.Scanner;

public class rightarrow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines : ");
        int n=sc.nextInt(); 
        //uper part
        for(int line=1;line<n;line++){
            for(int space=1;space<=2*line-2;space++){
                System.out.print(" ");
            }
            for(int star=line;star<=n;star++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower part
        for(int line=1;line<=n;line++){
            for(int space=1;space<(2*n-(2*line));space++){
                System.out.print(" ");
            }
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
