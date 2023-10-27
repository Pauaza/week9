import java.util.Scanner;
public class LinearSearch25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key;
        int jmlhArray;
System.out.print("Masukkan jumlah elemen array: ");
jmlhArray = sc.nextInt();
 int[] arrayInt = new int[jmlhArray];

        for (int i = 0; i< jmlhArray; i++){
            System.out.print("Masukkan elemen Array ke- "+(i)+" :");
            arrayInt[i] = sc.nextInt();  
        }
        System.out.print("Masukkan key yang ingin dicari: ");
        key = sc.nextInt();

        boolean ditemukan = false;
        for (int i=0; i<jmlhArray;i++ ){
            if (key == arrayInt [i]){
            System.out.print("key ada dalam array posisi indeks ke-: "+i);
            ditemukan=true;
            break;
            }
        }
        if (ditemukan == false){
            System.out.print("key tidak ditemukan");
        }

        
    }
    
}
