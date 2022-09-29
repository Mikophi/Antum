public class If {
    public static void main(String [] args) {
        var nilai = 78;
        var absen = 98;

        if(nilai >= 75 && absen >= 75) {
            System.out.println("Anda Lulus");
        } else {
            System.out.println("Anda Tidak Lulus");
        } if (nilai >= 80 && absen >=88) {
            System.out.println("nilai Anda A");
        } else if (nilai >= 68 && absen >=60) {
            System.out.println("nilai Anda B");
        } else if (nilai >= 58 && absen >=50) {
            System.out.println("nilai Anda C");
        } else if (nilai >= 48 && absen >=40) {
            System.out.println("nilai Anda D");
        } else {
            System.out.println("nilai Anda E");
        }
    }
}
