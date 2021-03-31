package wordCount;

import java.io.*;


public class Characters {
 
    public static void charCount(String path, String charset) throws IOException {
 
        int charCount = 0;
 
        BufferedReader buff = new BufferedReader(new InputStreamReader(new FileInputStream(path), charset), 1024 * 64);
        int read = -1;
        while ((read = buff.read()) != -1) {
        	if(read>=32&&read<=126) {
        		charCount++;
        	}
        }
        buff.close();
   
        System.out.println("×Ö·ûÊı£º" + charCount);
    }
}
