import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double yariCap;
        int pi = 3;


        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin Yarı Çapını Giriniz: ");
        yariCap = input.nextDouble();


        System.out.println("Dairenin Alanı: " +(yariCap*yariCap*pi));
        System.out.println("Dairenin Çevresi:" +(2*pi*yariCap));








    }
}