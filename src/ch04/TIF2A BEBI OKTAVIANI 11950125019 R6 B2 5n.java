package arraych04;
public class Arraych04n {
    public static void main(String[] args) {
        int nilai[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Selisih angka - angka dalam array : ");
        int jumlah = 0;
        for (int i = 0; i < nilai.length-1; i++) {
            int jumlah_sementara = nilai[i] + nilai[i+1];
            System.out.println("Penjumlahan index " + i + " dengan index " + (i+1) + " adalah " + jumlah_sementara);
            jumlah = jumlah + jumlah_sementara;
            System.out.println("Setelah ditotal dengan nilai sebelumnya : " + jumlah);
        }
        System.out.println("Nilai Akhir : " + jumlah);
    }   
}