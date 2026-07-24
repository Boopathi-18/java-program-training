public class nullpointerexp {
    public static void main(String[] args) {
        try{
            String s=null;
            System.out.println(s.length());
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("End program!");
        }
    }
}
