package com.easipass.pattern.singelton.seriable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SeriableTest {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Seriable s1 = null;
        Seriable s2 = Seriable.getInstance();
        //系列化，将对象s2写到文件中
        FileOutputStream fos = new FileOutputStream("1.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s2);
        oos.flush();
        oos.close();
        
        //反序列化，读取文件，转成对象
        FileInputStream fis = new FileInputStream("1.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        s1 = (Seriable)ois.readObject();
        System.out.println(s1);
        System.out.println(s2);
	}

}
