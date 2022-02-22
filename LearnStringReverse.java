import java.util.Scanner;

public class LearnStringReverse {
    public static void findReverse(String s,int len){
        if(len==0) {
            System.out.print(s.charAt(len));
            return;
        }
        System.out.print(s.charAt(len));
        findReverse(s, len-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter Your name:");

        String s=sc.nextLine();
        int len=s.length();

        findReverse(s,len-1);
    }
}
