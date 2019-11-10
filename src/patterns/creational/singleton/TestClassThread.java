package patterns.creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static patterns.creational.singleton.TestClass.printout;

class TestClassThread {
    static void useSingleton(){
        SingletonPattern single=SingletonPattern.getInstance();
        printout("single",single);
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
    }
}
