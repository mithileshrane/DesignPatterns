package patterns.creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static patterns.creational.singleton.TestClass.printout;

public class TestClassEnumAccess {
    static void useSingleton(){
        SingleEnumPattern single=SingleEnumPattern.INSTANCE;
        printout("single data"+single.getConfiguration(),single );
    }

    public static void main(String[] args) throws Exception{
        ExecutorService service= Executors.newFixedThreadPool(5);
        service.submit(TestClassThread::useSingleton);
        service.submit(TestClassThread::useSingleton);
        service.submit(TestClassThread::useSingleton);
        service.submit(TestClassThread::useSingleton);
        service.submit(TestClassThread::useSingleton);
        service.submit(TestClassThread::useSingleton);
        service.submit(TestClassThread::useSingleton);
        service.submit(TestClassThread::useSingleton);

        service.shutdown();

        SingleEnumPattern enumPattern=SingleEnumPattern.INSTANCE;
        System.out.println("hg"+enumPattern.getConfiguration());
    }
}
