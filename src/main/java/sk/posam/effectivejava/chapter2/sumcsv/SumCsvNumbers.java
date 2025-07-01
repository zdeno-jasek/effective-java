package sk.posam.effectivejava.chapter2.sumcsv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Sum all number values from CSV file.
 * If there is a non-numeric value, ignore it.
 */
class SumCsvNumbers {

    int sum() throws FileNotFoundException {
        int sum = 0;

        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("numbers.csv");
            br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                for (String value : values) {
                    try {
                        sum += Integer.parseInt(value.trim());
                    } catch (NumberFormatException e) {
                        // Ignore non-numeric values
                    }
                }
            }
            fr.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return sum;
    }
}
