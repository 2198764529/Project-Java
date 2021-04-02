package wordCount;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Word {
	
	public static void word(String fileName) throws IOException {
	       
    	File file = new File(fileName);//定义一个file对象，用来初始化FileReader
    	if(!file.exists()){
    		System.out.println(0);
        }
        FileInputStream inputStream = new FileInputStream(file);
        int length = inputStream.available();
        byte bytes[] = new byte[length];
        inputStream.read(bytes);
        inputStream.close();
        String str =new String(bytes, StandardCharsets.UTF_8);
        //System.out.println(str);
        
        String[] str1 = str.split("\\s+");
        for(String ss : str1){
            //System.out.println(ss);
        }
        int i;
        
        // 按指定模式在字符串查找
        String pattern = "^[a-zA-Z]{4}[a-zA-Z0-9]*$";
        String pattern1 = "[a-zA-Z]{4}$";
        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);
        Pattern r1 = Pattern.compile(pattern1);          
      //  String[] str2 = new String[str1.length];
        ArrayList<String> lists =new ArrayList<>();
       
        int k=0;
        // 现在创建 matcher 对象
        for(i=0;i<str1.length;i++){
        	Matcher m = r.matcher(str1[i]);
        	Matcher m1 = r1.matcher(str1[i]);
        	if(m.find()||m1.find()) {
        		StringBuffer sb = new StringBuffer();
        		for(int j=0; j < str1[i].length(); j++) {
        			
    				//索引指定位置的字符
    				char c = str1[i].charAt(j);
    				
    				//判断是否为小写字母
    				if(Character.isUpperCase(c)) {
    					sb.append(Character.toLowerCase(c));
    				}else {
    					sb.append(Character.toLowerCase(c));
    				}
    				
    			}
        		str1[i]=sb.toString();
        		//System.out.println(str1[i]);
        		lists.add(str1[i]);
        		
        	}
        }

        //System.out.println("words: "+lists.size());
        Set set=new HashSet(lists);
        set.remove(null);
        System.out.println("words: "+set.size());

    }
}









