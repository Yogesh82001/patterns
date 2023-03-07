import java.util.Scanner;

import javax.naming.ldap.ManageReferralControl;

public class crossdiagonal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines : ");
        int n=sc.nextInt(); 
        for(int line=1;line<=n;line++){
            for(int space=1;space<=n;space++){
                
                if(line==space||(line+space)==n+1){
                    System.out.print("*");

                }
                else{
                    System.out.print(".");
                }

            }
            System.out.println();
        }
    }
    
}
