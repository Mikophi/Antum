

public class TipeDataNumber {
    private static final String var = null;

public static void main(String[] args) {
        
//        Integer Number
        byte Bit = 100;
        short Short = 1000;
        int Int = 10000;
        long Long = 100000;
        long Long2 = 100000L;
        
//        Float Number
        float Float = 10.10F;
        double Double = 10.10;
        
//        Literals Number
        int decInt = 36;
        int hexInt = 0xA123;
        int binInt = 0b00101011;
        
//        Under_Score
        long balance = 1_000_000_000;
        int sum = 60_000_000;

//        Under_Score Number
        int amount = 1_1_000000;

        // Konversi tipe data number
        byte inibyte =18;
        short inishort = inibyte;
        int iniint = inishort;
        long inilong = iniint;
        float inifloat = inilong;
        double inidouble = inifloat;

        float inifloat2 = (float) inidouble;
        long inilong2 = (long) inifloat2;
        int iniint2 = (int) inilong2;
        short inishort2 = (short) iniint2;
        
    }
    
}