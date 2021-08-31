import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Cau3 c3 = new Cau3();
        Scanner sc=new Scanner(System.in);
        System.out.print("Input month: ");
        int m=sc.nextInt();
        if(c3.checkMonth(m)){
            c3.printDayInMonth(m);
        }else {
            System.out.println("Month invalid");
        }
    }
}
