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

	public Lines(String str) {
		
	}
	
	public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        InputStream in = new FileInputStream(file);
    }
	
	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
 
		String fileName=null;
        // nextLine方式接收字符串
        System.out.println("输入要查询的文件名");
        // 判断是否还有输入
        if (scan.hasNextLine()) {
        	fileName = scan.nextLine();
            System.out.println("文件名：" + fileName);
        }
        scan.close();
        readFile(fileName);
       
	}
}
