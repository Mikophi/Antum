public class operasibool {
    public static void main(String [] args) {
        var absen = 78;
        var nilaiakhir = 88;

        var lulusabsen = absen>= 78;
        var lulusnilaiakhir = nilaiakhir >= 88;
        var lulus = lulusabsen && lulusnilaiakhir;
        System.out.println(lulus);
    }
    
}
