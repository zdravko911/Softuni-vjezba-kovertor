import java.util.Scanner;

public class InchesToCm {

    public static void main(String[] args) {
        System.out.println("Do you want to convert inches or centimeters?");
        Scanner inputSkener = new Scanner(System.in);
        String input = inputSkener.nextLine();

        if ("inches".equals(input)) {
            System.out.println("Unesite vrijednost u inchima: ");
            Scanner pretvorba = new Scanner(System.in);
            double inch = pretvorba.nextDouble();
            double cm = inch * 2.54;
            System.out.println(inch + "inca = " + cm + " centimetara.");
        } else if ("centimeters".equals(input)){
            System.out.println("Unesite vrijednost u centimetrima: ");
            Scanner vrijednostCm = new Scanner(System.in);
            double cm1 = vrijednostCm.nextDouble();
            double inch2 = cm1 / 2.54;
            System.out.println(cm1 + " centimetara = " + inch2 + " inca.");
        } else {
            System.out.println("Niste unijeli jednu od sljedecih vrijednosti: inches/centimeters");
        }
    }
}
