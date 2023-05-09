import java.util.Scanner;
public class DaireAlanHesaplama{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double PI = 3.14;
        System.out.print("Dairenin yarıçapını giriniz: ");
        int yariCap = sc.nextInt();

        System.out.print("Merkez açısının ölçüsünü giriniz: ");
        int merkezAci = sc.nextInt();

        double daireAlani = (PI * (yariCap*yariCap)* merkezAci) / 360;

        System.out.print("Dairenin alanı: "+daireAlani);
        



    }
}