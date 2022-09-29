public class Switch {
    public static void main(String[] args) {
        char nilai = 'A';
        switch (nilai) {
            case 'A':
            System.out.println("Wow anda lulus dengan sangat baik");
            break;
            case 'B':
            System.out.println("anda lulus dengan baik");
            break;
            case 'C':
            System.out.println("anda lulus");
            break;
            case 'D':
            System.out.println("anda tidak lulus");
            break;
            default:
            System.out.println("Mungkin antum salah jurusan");
        }
    }
    
}
