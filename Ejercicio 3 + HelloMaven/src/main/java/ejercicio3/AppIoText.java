package ejercicio3;

public class AppIoText {
        public static void main(String[] args) {
            if (args.length != 1) {
                System.err.println("El programa necesita el path del archivo para pillar los números!!");
                System.exit(-1);
            }

            try {
                double average = AverageFileCalculator.average(args[0]);
                System.out.println("Average = " + average);
            } catch (FileParsingException e) {
                e.printStackTrace();
            } catch (BigNumberException e) {
                e.printStackTrace();
            }
        }
}

