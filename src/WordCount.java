package wordCount;

import java.io.IOException;
import java.util.Scanner;

public class WordCount {

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
        Characters characters=new Characters();
        characters.charCount(fileName,"utf-8");
        Word w=new Word();
        w.word(fileName);
        Lines l=new Lines();
        l.readFile(fileName);
        Words ws=new Words();
        ws.words(fileName);
	}

}
