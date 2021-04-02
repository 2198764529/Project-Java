package wordCount;

import java.io.IOException;
import java.util.Scanner;

public class WordCount {

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
        Characters characters=new Characters();
        characters.charCount(fileName,"utf-8");
        Word w=new Word();
        w.word(fileName);
        Lines l=new Lines();
        l.lines(fileName);
        Words ws=new Words();
        ws.words(fileName);
	}

}
