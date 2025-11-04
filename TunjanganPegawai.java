import java.util.Scanner;

public class TunjanganPegawai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan gaji kotor: ");
        double gaji = input.nextDouble();
        System.out.print("Masukkan jumlah anak: ");
        int anak = input.nextInt();

        double tunjangan = hitungTunjangan(gaji, anak);
        System.out.println("Besar tunjangan yang diterima adalah: " + tunjangan);

        input.close();
    }

     public static double hitungTunjangan(double gajiKotor, int jumlahAnak) {
        if (jumlahAnak < 3) {
            return 0.2 * gajiKotor;  
        } else {
            return 0.3 * gajiKotor;  
        }
    }

}
