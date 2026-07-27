public class string {
    public static void main(String[] args) {
        String s="aSARAN@";
        StringBuilder r=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int a =(int) ch;
            if(ch>=65&&ch<=90){
                r.append((char)(a+32));
            }
            else if(ch>=97&&ch<=122){
                r.append((char)(a-32));
            }
            else{
                r.append(ch);
            }
        }
        System.out.println(r.toString());
    }
}
