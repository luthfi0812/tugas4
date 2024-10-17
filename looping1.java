package perulangan;

public class looping1{
    public static void main(String[] args) {
        int start = 1;
        for (int a = 1; a<= 4; a++ ) {
            int jumlahangka;
            if (a ==3) {
                jumlahangka = 4;
            }else {
                jumlahangka = 5;
            }
            for (int b = 1; b<= jumlahangka; b++){
                if (start == 6 || start == 12 || start == 17) {
                    start++;
                }
                System.out.print(start + " ");
                start++;
            }
            System.out.println();
        }

    }
}    
