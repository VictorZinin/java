import java.util.Scanner;

public class seminar1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(),  m = sc.nextInt(),  x = sc.nextInt();
        if (h > m && h > x){
            System.out.println(h);
        }
        if(m>x){
            System.out.println(m);
        }
        else {
            System.out.println(x);
        }
    }
    
}