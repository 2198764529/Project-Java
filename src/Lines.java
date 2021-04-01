package wordCount;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class Lines {

	public static void readFile(String fileName) {
        File file = new File(fileName);
        Reader reader = null;
        try {
            reader = new InputStreamReader(new FileInputStream(file),"UTF-8");

            int tempchar,i=0;
            String s = "";
            while ((tempchar = reader.read()) != -1) {
                if (((char) tempchar) != '\r') {              	
                    //System.out.println((char) tempchar);
                }else {
                	i++;
                }
            }
            
            System.out.println("lines: "+i);
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
    }
}

