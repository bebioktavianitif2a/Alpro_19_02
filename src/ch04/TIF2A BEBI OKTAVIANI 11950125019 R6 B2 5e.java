package arraych04;
public class Arraych04e {
    public static void main(String[] args) {
        int nilai[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Nilai yang mengandung angka 2 : ");
        for (int i = 0; i < nilai.length; i++) {
            if(String.valueOf(nilai[i]).contains("2")){
               System.out.print(nilai[i] + " ");            
            }
        }
    }   
}