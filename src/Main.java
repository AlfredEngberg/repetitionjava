import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> loggfilen = readLogfile();
        int antalErrors = countErrors();
    }

    public static ArrayList<String> readLogfile() {
        ArrayList<String> logfil = new ArrayList<>();

         Scanner fil;

            try {
                fil = new Scanner(new FileReader("ideaold.log"));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            while (fil.hasNext()) {
                logfil.add(fil.nextLine());
            }
            return logfil;
        }

    public static int countErrors () {
        int error = 0;
        while (error > 4){
            error++;
        }
        return error;
    }

}

