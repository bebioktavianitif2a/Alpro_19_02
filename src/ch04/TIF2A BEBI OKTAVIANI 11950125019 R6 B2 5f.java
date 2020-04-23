package arraych04;
public class Arraych04f {
    public static void main(String[] args) {
        int nilai[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Angka−angka ganjil yang diapit oleh angka genap : ");
        for (int i = 0; i < nilai.length; i++) {
            if(i != nilai.length-1){
                if(nilai[i] % 2 != 0){
                    if (nilai[i-1] % 2 == 0) {
                        if(nilai[i+1] %2 == 0){
                            System.out.print(nilai[i] + " ");
                        }
                    }
                }
            }
        }
    }   
}