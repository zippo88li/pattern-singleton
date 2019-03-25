package com.gupao.zippo;

import com.gupao.zippo.pattern.hungry.HungrySingleton;

import java.lang.reflect.Constructor;

public class ReflectBrokenSingletonTest {
  public  static  void  main(String[] args){

      try {
          HungrySingleton h=     HungrySingleton.getInstance();
          HungrySingleton h1=     HungrySingleton.getInstance();

          //TSE clasz=(TSE) Class.forName("com.gupao.zippo.pattern.hungry.TSE").newInstance();
          Class<?>  clzz=HungrySingleton.class;
          //获取静态的构造函数
          Constructor c= clzz.getDeclaredConstructor(null);
          //设置强吻
          c.setAccessible(true);


          Object hungrySingleton= c.newInstance();
          Object hungrySingleton1=  c.newInstance();

          System.out.println(hungrySingleton);
          System.out.println(hungrySingleton1);
          System.out.println(hungrySingleton==hungrySingleton1);

      } catch (Exception e) {
          e.printStackTrace();
      }
  }
}
