import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        player marco = new player();

        marco.power = 6;

        System.out.println("P1 set your name: ");
        String p1Name = myScan.nextLine();
        marco.setName(p1Name);

        System.out.println(marco.getName() + "change your power level. It is now a lowly" + marco.getPower());
        int p1NewPower = myScan.nextInt();
        marco.setName(String.valueOf(p1NewPower));

        System.out.println("It is now a" + marco.getPower());
    }
}
