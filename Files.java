package wordCount;

import java.io.*;
import java.util.Scanner;
public class Files {

	public static void readFile(String fileName) {
        File file = new File(fileName);
        Reader reader = null;
        try {
            
            reader = new InputStreamReader(new FileInputStream(file),"UTF-8");

            int tempchar;
            while ((tempchar = reader.read()) != -1) {
                
                if (((char) tempchar) != '\r') {
                    System.out.print((char) tempchar);
                }
            }
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
	
	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
 
		String fileName=null;
      
        System.out.println("输入要查询的文件名");
        
        if (scan.hasNextLine()) {
        	fileName = scan.nextLine();
            System.out.println("文件名：" + fileName);
        }
        scan.close();
        readFile(fileName);
       
	}
}
