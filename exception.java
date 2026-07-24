public class exception {
    public static void main(String[] args) {
        int arr[]={39,-1,20};
        int sum=0;
        for(int k:arr){
            try{
                if(k<0){
                    throw new Exception("invalid:"+k);
                }
                else{
                    sum+=k;
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Sum:"+sum);
    }
}
