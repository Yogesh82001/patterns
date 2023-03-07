import java.util.Scanner;

public class leftpascal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines : ");
        int n=sc.nextInt(); 
        int mid=n/2;
        int totalstar=1;
        int totalspace=mid;
        for(int line=1;line<=n;line++){
            for(int space=1;space<=totalspace;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=totalstar;star++){
                System.out.print("*");
            }
            if(line<mid){
                totalstar++;
                totalspace--;
            }
            else{
                totalspace++;
                totalstar--;
            }
            System.out.println();
        }
        
    
}
}


