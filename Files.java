package wordCount;

import java.io.*;
import java.util.Scanner;
public class Files {

	public static void readFile(String fileName) {
        File file = new File(fileName);
        Reader reader = null;
        try {
            System.out.println("���ַ�Ϊ��λ��ȡ�ļ����ݣ�һ�ζ�һ���ֽڣ�");
            // һ�ζ�һ���ַ�
            reader = new InputStreamReader(new FileInputStream(file),"UTF-8");

            int tempchar;
            while ((tempchar = reader.read()) != -1) {
                // ����windows�£�\r\n�������ַ���һ��ʱ����ʾһ�����С�
                // ������������ַ��ֿ���ʾʱ���ỻ�����С�
                // ��ˣ����ε�\r����������\n�����򣬽������ܶ���С�
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
