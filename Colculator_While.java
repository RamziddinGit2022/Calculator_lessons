import java.util.Scanner;

public class Colculator_While {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Kiriting: ");
            System.out.println("1. (+) Qo'shish: ");
            System.out.println("2. (-) Ayirish: ");
            System.out.println("3. (*) Ko'paytirish: ");
            System.out.println("4. (/) Bo'lish: ");
            System.out.println("6. (!) Chiqish...");
            int valyue = in.nextInt();
            int result;

            if(valyue == 5){
                   break;
            } else if (valyue == 1) {
                System.out.println("Birinchi son kiriting: ");
                int a = in.nextInt();
                System.out.println("Ikkinchi son kiriting: ");
                int b = in.nextInt();

                result = a + b;
                System.out.println("Javob: " + result);
                System.out.println();
            } else if (valyue == 2) {
                System.out.println("Birinchi son kiriting: ");
                int a = in.nextInt();
                System.out.println("Ikkinchi son kiriting: ");
                int b = in.nextInt();

                result = a - b;
                System.out.println("Javob: " + result);
                System.out.println();
            } else if (valyue == 3) {
                System.out.println("Birinchi son kiriting: ");
                int a = in.nextInt();
                System.out.println("Ikkinchi son kiriting: ");
                int b = in.nextInt();

                result = a * b;
                System.out.println("Javob: " + result);
                System.out.println();
            } else if (valyue == 4) {
                System.out.println("Birinchi son kiriting: ");
                int a = in.nextInt();
                System.out.println("Ikkinchi son kiriting: ");
                int b = in.nextInt();

                result = a / b;
                System.out.println("Javob: " + result);
                System.out.println();
            }
            else {
                System.out.println("Eror!");
            }


        }



    }
}
