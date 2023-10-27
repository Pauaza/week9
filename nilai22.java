import java.util.Scanner;
public class nilai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlhelemen;

        System.out.print("Masukkan jumlah elemen:");
        jmlhelemen = sc.nextInt();
        int nilai [] = new int[jmlhelemen];

        int totalNilai=0;
        for (int i=0;i<jmlhelemen; i++){
            System.out.print("Masukkan nilai elemen ke- "+(i+1)+":");
            nilai [i] = sc.nextInt();
            totalNilai += nilai[i];
        }
        int nilaiTertinggi = nilai[0];
        for (int i=0; i<jmlhelemen;i++){
            if (nilaiTertinggi<nilai[i]){
                nilaiTertinggi=nilai[i];
            }
        }System.out.println("Nilai tertinggi adalah: "+nilaiTertinggi);
        int nilaiTerendah = nilai[0];
        for (int i=0;i<jmlhelemen;i++){
            if (nilaiTerendah>nilai[i]){
                nilaiTerendah=nilai[i];
            }
        }System.out.println("nilai terendah adalah: "+nilaiTerendah);

        double ratarata;
        ratarata=totalNilai/jmlhelemen;
        System.out.println("Rata rata semua elemen: "+ratarata);
        System.out.println("Total nilai adalah:("+totalNilai+")");
    }
}
