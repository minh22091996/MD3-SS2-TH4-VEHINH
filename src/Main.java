import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = -10;
        Scanner sc = new Scanner(System.in);

        while (a != 0){
            System.out.println("so 1 hien hinh tam giac");
            System.out.println("so 2 hien hinh chu nhat");
            System.out.println("so 3 hinh vuong");
            System.out.println("vui long nhap so ban chon :");
            a = sc.nextInt();
            switch (a){
                case 1 :
                    System.out.println("**");
                    System.out.println("****");
                    System.out.println("******");
                    break;
                case 2 :
                    System.out.println("**********");
                    System.out.println("**********");
                    System.out.println("**********");
                    break;
                case 3:
                    System.out.println("****");
                    System.out.println("****");
                    break;
                case 0 :
                    System.exit(0);
                default:
                    System.out.println("so ban nhap khong co trong lua chon " +
                            ",vui long chon lai !");
            }
        }
    }
}
