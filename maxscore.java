import java.util.*;
public class maxscore {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt(),s=1,m=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<=n-k;i++){
            s=0;
            int g=1;
        for(int j=i;j<k+i;j++){
            s+=a[j]*g;
            if(s>m)
                m=s;
            g++;
        }
    }
        System.out.println("Max_score:"+m);
    }
}