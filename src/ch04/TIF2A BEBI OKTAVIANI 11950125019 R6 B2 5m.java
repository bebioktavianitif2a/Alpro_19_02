package arraych04;
public class Arraych04m {
    public static void main(String[] args) {
        int nilai[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Selisih angka - angka dalam array : ");
        int jumlah = 0;
        for (int i = 0; i < nilai.length-1; i++) {
            int selisih = nilai[i] - nilai[i+1];
            selisih = Math.abs(selisih);
            System.out.println("Selisih index " + i + " dengan index " + (i+1) + " adalah " + selisih);
            jumlah = jumlah + selisih;
        }
        System.out.println("Jumlah angka−angka selisih : " + jumlah);
    }   
}