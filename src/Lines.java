package wordCount;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class Lines {

	public static void lines(String fileName) throws IOException {
        File file = new File(fileName);
        int i=0;
        BufferedReader in = new BufferedReader(new FileReader(file));
        String value = in.readLine();
        while (value != null) {
        	if(!"".equals(value)) {
        	   i++;
        	}
            value=in.readLine();
        }
        if (in!= null)
			in.close();
		
        System.out.println("lines: "+i);
    }
}

