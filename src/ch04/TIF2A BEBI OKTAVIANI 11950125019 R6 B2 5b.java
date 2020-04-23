package arraych04;
public class Arraych04b {
    public static void main(String[] args) {
        int nilai[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int nilai_cari = 19;
        System.out.println("Mencari nilai " + nilai_cari);
        for (int i = 0; i < nilai.length; i++) {
            if(nilai[i] == nilai_cari){
               System.out.println("Nilai " + nilai_cari + " ditemukan pada index ke " + i);            
            }
        }
    }   
}