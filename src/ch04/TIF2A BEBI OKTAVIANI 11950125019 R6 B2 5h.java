package arraych04;
public class Arraych04h {
    public static void main(String[] args) {
        int nilai[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Jumlah angka dalam array : ");
        int jumlah = 0;
        for (int i = 0; i < nilai.length; i++) {
            jumlah = jumlah + nilai[i];
        }
        System.out.println(jumlah);
    }   
}