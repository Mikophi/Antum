public class TDBF
{
    public static void main(String [] args) {
        
            Integer iniint = 10;
            Long inilong = 18L;
            Boolean iniboolean = true;
        
            Short iniShort; //null
            iniShort = 100;
        System.out.println(iniShort);
        
        // Konversi
        int age = 38;
        Integer ageObject = age;
        int ageagain = ageObject;
        short shortage = ageObject.shortValue();
        byte byteage = ageObject.byteValue();
    }
}

