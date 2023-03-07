import java.util.Scanner;

public class hollowdiamondstar {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines : ");
        int n=sc.nextInt();
        //upper part 
        for(int line=1;line<=n;line++){
            for(int star=n;star>=line;star--){
                System.out.print("*");
            }
            for(int space=1;space<=2*line-2;space++){
                System.out.print(" ");

            }
            for(int star=n;star>=line;star--){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower part
        for(int line=1;line<=n;line++){
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
            for(int space=2*line-2;space<2*n-2;space++){
                System.out.print(" ");

            }
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
