import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }

    public static ArrayList<String> filereader() {
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
    }

