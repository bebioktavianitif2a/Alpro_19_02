package arraych04;
public class Arraych04i {
    public static void main(String[] args) {
        int nilai[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Selisih angka - angka dalam array : ");
        for (int i = 0; i < nilai.length-1; i++) {
            int selisih = nilai[i] - nilai[i+1];
            selisih = Math.abs(selisih);
            System.out.println("Selisih index " + i + " dengan index " + (i+1) + " adalah " + selisih);
        }
    }   
}