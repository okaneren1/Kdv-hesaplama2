import java.util.Scanner;
public class kdv {
    public static void main(String[] args) {
        double tutar, kdv,kdvlitutar,kdvoran;
        Scanner inp = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz: ");
        tutar = inp.nextDouble();
        kdv = (tutar>=0 && tutar<=1000) ? 0.18 : 0.08;
        kdvoran = tutar *kdv;
        kdvlitutar = tutar + kdvoran;
        System.out.println("KDV'siz fiyat:" + tutar);
        System.out.println("KDV Oranı:" + kdvoran);
        System.out.println("KDV'li fiyat:" + kdvlitutar);




    }
}
