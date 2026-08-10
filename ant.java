public class ant {
    public static void main(String[] args) {
        int a[]={1,-1,1,-1,1};
        int c=0;
        for(int i:a){
            if(i==-1){
                c++;
            }
        }
        System.out.println(c);
    }
}