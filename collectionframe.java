import java.util.*;
public class collectionframe {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        ArrayList <Integer> list=new ArrayList<>();
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            list.add(s.nextInt());
            Iterator<Integer>it=list.iterator();
            while(it.hasNext()){
                int val=it.next();
                if(val%2==1){
                    it.remove();
                }
            }
        }
        System.out.println(list);
    }
}
