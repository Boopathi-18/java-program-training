import java.util.Scanner;
class ATM{
    private int natm=1207,intialba;
    boolean catm(int n){
        return natm==n;
    }
    void display(int i,int d){
        intialba=i;
       intialba+=d;
    }
    void wi(int w){
        if(intialba<w){
            System.out.println("Insufficient");
        }
        else
        intialba-=w;
    }
    int getn(){
        return intialba;
    }

}
public class bank{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ATM a=new ATM();
        if(!(a.catm(n))){
            System.out.println("invlia pin");
            return;
        }
        int i=s.nextInt(),d=s.nextInt(),w=s.nextInt();
        a.display(i,d);
        a.wi(w);
        System.out.println(a.getn());
    }
}