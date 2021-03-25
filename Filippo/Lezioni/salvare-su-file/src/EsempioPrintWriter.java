import java.io.*;
import java.util.Scanner;

public class EsempioPrintWriter {

    public static void main(String[] args) {
        String nomeFile = "output.txt";
        PrintWriter pw = null;

        try {
           pw = new PrintWriter(nomeFile);
        } catch (FileNotFoundException e) {
            System.out.println("Errore");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner tastiera = new Scanner(System.in);
        pw.println(tastiera.next());
        pw.close();


        Scanner file = null;

        try {
            file = new Scanner(new File(nomeFile));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(file.nextLine());


    }
}
