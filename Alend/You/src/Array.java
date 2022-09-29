public class Array {
    public static void main(String [] args) {
        String[] arrayString;
        arrayString = new String[2];
        arrayString[0] = "Agung Fajar ";
        arrayString[1] = "Risnandar";

        // Array Initialazer
        int[] arrayInt = new int[] {
            10,12,11,14,15
        };
        long[] arrayLong = {
            10,12,11,14,15
        };
        arrayLong[0] = 100;
        System.out.println(arrayLong[0]);
        System.out.println(arrayLong[1]);
        System.out.println(arrayLong.length);

        // Array didalam Array
        String[][] members = {{"Agung", "Fajar", "Risnandar"},
        {"Vanesha","Millim"},
        {"Candra","Winata"}
    };
    String[] members1 = members[0];
    System.out.println(members1[0]);
    System.out.println(members[1][0]);
    System.out.println(members[2][0]);
            
        
        
    }
}
