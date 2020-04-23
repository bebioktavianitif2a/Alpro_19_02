package arraych04;
public class Arraych04k {
    public static void main(String[] args) {
        int nilai[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Angka−angka yang setelahnya bernilai lebih besar : ");
        for (int i = 0; i < nilai.length; i++) {
            if(i < nilai.length-1){
                if(nilai[i+1] > nilai[i]){
                    System.out.println("Nilai " + nilai[i] + " ditampilkan karena nilai setelahnya lebih besar yaitu " + nilai[i+1]);
                }
            }
        }
    }   
}