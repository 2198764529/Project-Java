package wordCount;

import java.io.*;
import java.util.Scanner;
public class Files {

	public static void readFile(String fileName) {
        File file = new File(fileName);
        Reader reader = null;
        try {
            System.out.println("以字符为单位读取文件内容，一次读一个字节：");
            // 一次读一个字符
            reader = new InputStreamReader(new FileInputStream(file),"UTF-8");

            int tempchar;
            while ((tempchar = reader.read()) != -1) {
                // 对于windows下，\r\n这两个字符在一起时，表示一个换行。
                // 但如果这两个字符分开显示时，会换两次行。
                // 因此，屏蔽掉\r，或者屏蔽\n。否则，将会多出很多空行。
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
