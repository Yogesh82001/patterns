import java.util.Scanner;

public class mirrorinvertedhalftriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines : ");
        int n=sc.nextInt();
        int totalspace=1;
        int totalstar=n;
        for(int line=1;line<=n;line++){
            for(int space=totalspace;space<line;space++){
                System.out.print(" ");

            }
            for(int star=totalstar;star>=1;star--){
                System.out.print("*");
            }
            totalstar--;
            System.out.println();

        }
    }
    }
    

