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
        // nextLine��ʽ�����ַ���
        System.out.println("����Ҫ��ѯ���ļ���");
        // �ж��Ƿ�������
        if (scan.hasNextLine()) {
        	fileName = scan.nextLine();
            System.out.println("�ļ�����" + fileName);
        }
        scan.close();
        readFile(fileName);
       
	}
}
