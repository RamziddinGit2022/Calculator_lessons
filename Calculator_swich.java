import java.util.Scanner;

public class Calculator_swich {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("Kiriting: ");
            System.out.println("1. (+) Qo'shish: ");
            System.out.println("2. (-) Ayirish: ");
            System.out.println("3. (*) Ko'paytirish: ");
            System.out.println("4. (/) Bo'lish: ");
            System.out.println("5. (!) Chiqish...");
            int valyue = in.nextInt();
            int result;

            switch (valyue){
                case 1:
                    System.out.println("Birinchi son kiriting: ");
                    int a = in.nextInt();
                    System.out.println("Ikkinchi son kiriting: ");
                    int b = in.nextInt();
                    result = a + b;
                    System.out.println("Javob: " + result);
                    break;
                case 2:
                    System.out.println("Birinchi son kiriting: ");
                    int q = in.nextInt();
                    System.out.println("Ikkinchi son kiriting: ");
                    int w = in.nextInt();
                    result = q - w;
                    System.out.println("Javob: " + result);
                    break;
                case 3:
                    System.out.println("Birinchi son kiriting: ");
                    int e = in.nextInt();
                    System.out.println("Ikkinchi son kiriting: ");
                    int r = in.nextInt();
                    result = e * r;
                    System.out.println("Javob: " + result);
                    break;
                case 4:
                    System.out.println("Birinchi son kiriting: ");
                    int t = in.nextInt();
                    System.out.println("Ikkinchi son kiriting: ");
                    int y = in.nextInt();
                    result = t / y;
                    System.out.println("Javob: " + result);
                    break;
                default:
                    System.out.println("Eror! ");
            }
        }




    }
}
