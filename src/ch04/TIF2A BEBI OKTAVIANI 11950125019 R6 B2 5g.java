package arraych04;
public class Arraych04g {
    public static void main(String[] args) {
        int nilai[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Angka−angka kelipatan 5 yang sebelumnya juga angka kelipatan 5 : ");
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] % 5 == 0) {
                if(nilai[i-1] % 5 == 0){
                    System.out.print(nilai[i] + " ");
                }
            }
        }
    }   
}