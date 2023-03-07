import java.util.Scanner;


public class rightpascal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines : ");
        int n=sc.nextInt(); 
        int mid=n/2;
        for(int line=1;line<=n;line++){
            if(line<=mid){
            for(int star=1;star<=line;star++){
                System.out.print("*");
                
            }
        }
        else{
            
            for(int star2=n-line;star2>=1;star2--){
                    System.out.print("*");
            }
        }
            System.out.println();
            
        }
    }
    
}
