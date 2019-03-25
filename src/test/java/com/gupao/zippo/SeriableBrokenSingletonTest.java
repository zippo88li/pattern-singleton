package com.gupao.zippo;

import com.gupao.zippo.pattern.hungry.HungrySingleton;
import com.gupao.zippo.pattern.register.EnumSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SeriableBrokenSingletonTest {

    public static void main(String[] arg) {

        //反射破坏单例
        HungrySingleton h1 = HungrySingleton.getInstance();
        try {
            FileOutputStream fs = new FileOutputStream("HungrySingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fs);
            oos.writeObject(h1);
            oos.flush();
            fs.close();

            FileInputStream fis = new FileInputStream("HungrySingleton.obj");
            ObjectInputStream oois = new ObjectInputStream(fis);


            HungrySingleton h2 = (HungrySingleton) oois.readObject();
            fis.close();
            System.out.println(h1);
            System.out.println(h2);
            System.out.println(h1==h2);


        } catch (Exception e) {
              e.printStackTrace();
        } finally {

        }

          //反射不能破坏枚举式单例，jvm层面就考虑到了
//        EnumSingleton h1 = EnumSingleton.getInstance();
//        h1.setData(new Object());
//        try {
//            FileOutputStream fs = new FileOutputStream("EnumSingleton.obj");
//            ObjectOutputStream oos = new ObjectOutputStream(fs);
//            oos.writeObject(h1);
//            oos.flush();
//            fs.close();
//
//            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
//            ObjectInputStream oois = new ObjectInputStream(fis);
//
//
//            EnumSingleton h2 = (EnumSingleton) oois.readObject();
//            fis.close();
//            System.out.println(h1.getData());
//            System.out.println(h2.getData());
//            System.out.println(h1.getData()==h2.getData());
//
//
//        } catch (Exception e) {
//              e.printStackTrace();
//        } finally {
//
//        }



    }

}
