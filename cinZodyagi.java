import java.util.Scanner;

public class cinZodyagi {
    public static void main(String[] args) {
        int years;
        Scanner inp =new Scanner(System.in);

        System.out.print("Doğduğunuz yılı giriniz: ");
        years =inp.nextInt();
        int resault = years % 12;
        String msg = "Çin Zodyağı Burcunuz: ";

        switch(resault){
            case 0:
                System.out.println(msg +"maymun");
                break;
            case 1:
                System.out.println(msg +"horoz");
                break;
            case 2:
                System.out.println(msg +"köpek");
                break;
            case 3:
                System.out.println(msg +"domuz");
                break;
            case 4:
                System.out.println(msg +"fare");
                break;
            case 5:
                System.out.println(msg +"öküz");
                break;
            case 6:
                System.out.println(msg +"kaplan");
                break;
            case 7:
                System.out.println(msg +"tavşan");
                break;
            case 8:
                System.out.println(msg +"ejderha");
                break;
            case 9:
                System.out.println(msg +"yılan");
                break;
            case 10:
                System.out.println(msg +"at");
                break;
            case 11:
                System.out.println(msg +"koyun");
                break;
        }

    }
}
