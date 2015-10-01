package Ejercicio4;

        import java.io.File;
        import java.io.IOException;

public class AppIoBinary {
    public static void main(String[] args) throws IOException {
        BinaryIOClass testWrite = new BinaryIOClass(3, 7.5, 'a');
        testWrite.saveToFile("test-io-binary");

        BinaryIOClass testRead = BinaryIOClass.readFromFile("test-io-binary");
        System.out.println("enteros = " + testRead.getInteger());
        System.out.println("decimales = " + testRead.getDecimal());
        System.out.println("cadenas = " + testRead.getCharacter());

        File file = new File("test-io-binary");
        file.delete();
    }
}