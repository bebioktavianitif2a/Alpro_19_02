package arraych04;
public class Arraych04l {
    public static void main(String[] args) {
        int nilai[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Jumlah angka dengan angka setelahnya yang hasil penjumlahannya bernilai genap : ");
        for (int i = 0; i < nilai.length; i++) {
            if(i < nilai.length-1){
                if(nilai[i] % 2 == 0 & nilai[i+1] % 2 == 0){
                    System.out.println("Nilai index " + i + " dan " + (i+1) + " adalah genap dan jika dijumlahkan menjadi angka " + (nilai[i] + nilai[i+1]) + " (Genap)");
                }
            }
        }
    }   
}