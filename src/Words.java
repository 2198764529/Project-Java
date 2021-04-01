package wordCount;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Words {
	

	public static void words(String fileName) throws IOException {
	       
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
       // System.out.println(str);
        
        String[] str1 = str.split("\\s+");
//        for(String ss : str1){
//            System.out.println(ss);
//        }
        int i=0;
        
        // 按指定模式在字符串查找
        String pattern = "[a-zA-Z]{4}[a-zA-Z0-9]";
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

      //  System.out.println("words: "+lists.size());
        
        Map<String,Integer> map = new HashMap<>();
        for (String item : lists) {
            Integer count = 1;
            if (map.get(item)!=null) {
                count = map.get(item) + 1;
            }
            map.put(item,count);
        }
        Integer[] num=new Integer[map.size()];
        String[] str2=new String[map.size()];
        for (String key : map.keySet()) {
        	num[k]=map.get(key);
        	str2[k]=key;
           // System.out.println("元素"+key+"出现的次数为"+map.get(key));
          //  System.out.println(num[k]);
           // System.out.println(str2[k]);
            k++;
        }
        int max,n,temp,m=0;
        String temp1;
        for(m=0;m<map.size();m++) {
        	max=m;
        	for(n=m+1;n<map.size();n++) {
        		if(num[n]>num[max]) {
        			max=n;
        		}
        	}
        	temp=num[m];
        	num[m]=num[max];
        	num[max]=temp;
        	
        	temp1=str2[m];
        	str2[m]=str2[max];
        	str2[max]=temp1;
        //	System.out.println(num[m]+str2[m]);
        
        }
        //Set set=new HashSet<>(Arrays.asList(num));
        m=0;
        ArrayList<String> list1 =new ArrayList<>();
        ArrayList<String> list2 =new ArrayList<>();
        max=num[0];
        while(m<num.length) {
        	while(m<num.length) {
        		if(max==num[m]) {
        			list1.add(str2[m]);
                    m++;
            	}else {
            		max=num[m];
            		break;
            	}
        	}
        	//list1.sort(Comparator.);
    		Collections.sort(list1);
    		list2.addAll(list1);
    		list1.clear();
    		
        }
        if(list2.size()<=10) {
        	for(k=1;k<=list2.size();k++) {
        		System.out.println("word"+k+": "+list2.get(k-1));
            	
            }
    		
    	}else {
    		for(k=1;k<10;k++) {
        		System.out.println("word"+k+": "+list2.get(k-1));
            	
            }
    	}
        
        
    }
}











