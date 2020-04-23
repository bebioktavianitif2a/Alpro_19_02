package arraych04;
public class Arraych04j {
    public static void main(String[] args) {
        int nilai[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Selisih angka−angka genap dengan angka setelahnya yang genap pula : ");
        for (int i = 0; i < nilai.length; i++) {
            if(nilai[i] % 2 == 0){
                for (int j = i+1; j < nilai.length; j++) {
                    if(nilai[j] % 2 == 0){
                        int selisih = nilai[i] - nilai[j];
                        selisih = Math.abs(selisih);
                        System.out.println("Selisih index " + i + " dengan index " + (j) + " adalah " + selisih);
                        break;
                    }
                }
            }
        }
    }   
}