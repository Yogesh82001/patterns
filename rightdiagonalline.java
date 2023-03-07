import java.util.Scanner;

public class rightdiagonalline {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines : ");
        int n=sc.nextInt(); 
        int totalspacetop=n-1;
        int totalspacedown=1;
        int totalstar=1;
        for(int line=1;line<=n;line++){
            for(int space1=totalspacetop;space1>=1;space1--){
                System.out.print(".");
            }
            for(int star=1;star<=totalstar;star++){
                System.out.print("*");
            }
            // for(int space2=totalspacedown;space2<n-1;space2++){
            //     System.out.print(".");
            // }
            totalspacetop--;
            //totalspacedown++;
            System.out.println();

        }
    }
    
}
