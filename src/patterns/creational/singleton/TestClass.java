package patterns.creational.singleton;


import java.io.*;
import java.lang.reflect.Constructor;

class TestClass {
    public static void main(String[] args) throws Exception{

        SingletonPattern s1 = SingletonPattern.getInstance();
        //System.gc();
        SingletonPattern s2 = SingletonPattern.getInstance();

        printout("s1", s1);
        printout("s2", s2);

        //Reflection
        Class clazz= Class.forName(SingletonPattern.class.getName());
        Constructor<SingletonPattern> ctor=clazz.getDeclaredConstructor();
        ctor.setAccessible(true);
//        SingletonPattern s3=ctor.newInstance();
//        printout("s3",s3);


        //Serialziton
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\Users\\Samrans\\IJPrjSpace\\Patterns\\src/tmp/s2.ser"));
        oos.writeObject(s2);

        ObjectInputStream ois =new ObjectInputStream(new FileInputStream("C:\\Users\\Samrans\\IJPrjSpace\\Patterns\\src/tmp/s2.ser"));
        SingletonPattern s4= (SingletonPattern) ois.readObject();
        printout("s4",s4);

        //Cloning
        SingletonPattern s5= (SingletonPattern) s2.clone();
        printout("s5",s5);
    }

    public static void printout(String name, SingletonPattern object) {
        System.out.println(String.format("Object : %s, Hashcode :%d", name, object.hashCode()));
    }

    public static void printout(String name, SingleEnumPattern object) {
        System.out.println(String.format("Object : %s, Hashcode :%d", name, object.hashCode()));
    }
}

