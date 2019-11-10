package patterns.creational.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingletonPattern implements Serializable, Cloneable {
    //    private static SingletonPattern mSinglePattern=new SingletonPattern(); //eager
  /*  private static volatile SingletonPattern mSinglePattern = null; //lazy

    private SingletonPattern() {
        if (mSinglePattern != null) {
            throw new RuntimeException("Cannot create, Please use getInstance()");
        }
        System.out.println("Creating..");
    }

    public static  SingletonPattern getInstance() {
     //Double Checking
        if (mSinglePattern == null) {
            synchronized (SingletonPattern.class) {
                if (mSinglePattern == null)
                    mSinglePattern = new SingletonPattern();
            }
        }
        return mSinglePattern;
    }*/


    private SingletonPattern() {
        System.out.println("Creating..");
    }

    //Singleton Holder
    static class Holder{
        static final SingletonPattern INSTANCE=new SingletonPattern();
    }

    public static  SingletonPattern getInstance() {
        return Holder.INSTANCE;
    }


    private Object readResolve() throws ObjectStreamException {
        System.out.println("read solve ");
//        return mSinglePattern;
        return Holder.INSTANCE;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        throw new RuntimeException("Cannot create, Please use getInstance()");  // or use
//        assert mSinglePattern != null;
//        return mSinglePattern;
        return Holder.INSTANCE;
    }
}

