import java.util.Scanner;
public class pattern{
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of rows:");
	int n=s.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			
		if(i==n&&j<=5||j==1||j==5||i==5&&j<=5||j==7||i==n&&j>6||i==1&&j>6||j==n) 
			System.out.print(" *");
		
		else 
			System.out.print("  ");
		
	}
	
	System.out.println();
	
}
}
}

