package arraych04;
public class Arraych04c {
    public static void main(String[] args) {
        int nilai[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Nilai ganjil : ");
        for (int i = 0; i < nilai.length; i++) {
            if(nilai[i] % 2 == 1){
               System.out.print(nilai[i] + " ");            
            }
        }
    }   
}