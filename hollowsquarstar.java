import java.util.Scanner;

public class hollowsquarstar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines : ");
        int n=sc.nextInt();
        for(int line=1;line<=n;line++){
            for(int star=1;star<=n;star++){
                if(line==1||line==n||star==1||star==n){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
    
}
    

