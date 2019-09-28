import java.util.Scanner;
public class THTimUSCLN {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        a = sc.nextInt();
        System.out.println("Enter b:");
        b = sc.nextInt();
        if(a==0||b==0)
            System.out.println("No greatest common factor");
        a = Math.abs(a);
        b = Math.abs(b);
        while (a!=b){
            if(a>b)
                a = a - b;
            else
                b = b - a;


        }
//        a = Math.abs(a);
//        b = Math.abs(b);
        System.out.println("Greatest common factor: "+a);

    }

}
