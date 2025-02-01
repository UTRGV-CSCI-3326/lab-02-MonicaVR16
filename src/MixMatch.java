public class MixMatch {
    public static void main(String[] args) {
       String varString = "Hello, World";
       char varChar = 'M';
       short varShort = 32000;
       int varInt = 100000;
       long varLong = 9876543210L;
       float varFloat = 1.23f;
       double varDouble = 3.14159265359;
       boolean varBoolean = true; 
       


       System.out.println(varString + " <- String, stores a sequence of characters.");
       System.out.println(varChar + " <- Char, stores a single character.");
       System.out.println(varShort + " <- Short, stores whole numbers from -32,768 to 32,767.");
       System.out.println(varInt + " <- Integer, stores whole numbers from -2,147,483,648 to 2,147,483,647");
       System.out.println(varLong + " <- Long, stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,808");
       System.out.println(varFloat + " <- Float, real numbers with fractional parts.");
       System.out.println(varDouble + " <- Double, real numbers with fractional parts.");
       System.out.println(varBoolean + " <- Boolean, stores true or false.");

       System.out.println("Variables: " + varString + "," + varChar + "," + varBoolean);
    }
}