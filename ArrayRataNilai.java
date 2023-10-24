import java.util.Scanner;
public class ArrayRataNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double total = 0, totalTidakLulus = 0;
        double rata2, rata2Tidaklulus;
        int jmlhMahasiswaLolos = 0, jmlhMahasiswaTdkLolos = 0, jmlhMahasiswa;
        
        System.out.print("Masukkan Jumlah Mahasiswa: ");
        jmlhMahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[jmlhMahasiswa];

    for (int i = 0; i<nilaiMhs.length; i++){
        System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" :");
        nilaiMhs[i] = sc.nextInt();
    }for (int i = 0; i<nilaiMhs.length; i++){
        if (nilaiMhs[i] >70 ){
            System.out.println("Mahasiswa ke-"+i+" LULUS");
            total += nilaiMhs[i];
            jmlhMahasiswaLolos++;
        }else {
            System.out.println("Mahasiswa ke-"+i+" Tidak LULUS");
            totalTidakLulus += nilaiMhs[i];
            jmlhMahasiswaTdkLolos++;
        }
    }
    
    rata2 = total/jmlhMahasiswaLolos;
    System.out.println("Rata-rata nilai Mahasiswa yg Lolos = " +rata2);
    rata2Tidaklulus = totalTidakLulus/jmlhMahasiswaTdkLolos;
    System.out.println("Rata Rata Nilai Mahasiswa yg Tidak Lolos = "+ rata2Tidaklulus);
    }
}
