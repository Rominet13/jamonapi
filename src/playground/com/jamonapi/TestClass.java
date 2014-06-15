package com.jamonapi;

/** Class used to test all classes in JAMon.  It is only used during testing.  Mostly it calls other classes Main method.  JAMon

public class TestClass extends java.lang.Object implements Runnable {
    static final int THREADS=25000;
    public TestClass(int threadNum, long lobits, long hibits, Monitor mon) {
    }
    
 
    public void run() {
        // Alternating threads are either setting the high or lo bit.  The idea is that if a thread
    long lobits, hibits;
    static private class TimingMonitorThreads implements Runnable {
        public void run() {
    
    public static void main(String[] args) throws Exception {
        System.out.println("***** Class unit tests");
        MonitorFactory.main(null);
        System.out.println("\nTestClassPerformance.main()");
        System.out.println("\n***** MonitorFactory.getData():");
        Thread.sleep(350);
        for (int i=0; i<rows.length; i++) {
        
        timingMon=MonitorFactory.start();
        //Note mon1 is shared by all instances of the thread and so will test concurrent access.
        Monitor mon1=MonitorFactory.getTimeMonitor("mon1");
        Monitor mon2=MonitorFactory.getTimeMonitor("mon2");
        Monitor mon3=MonitorFactory.getTimeMonitor("mon3");
        while(threadGroup.activeCount()!=0)
        System.out.println("Threads have finished processing. It took "+timingMon.stop());
        Monitor mon4=MonitorFactory.start("mon4");
        while(threadGroup.activeCount()!=0)
        System.out.println("hits should be "+(THREADS+1)+"= "+mon4.stop());
        System.out.println("\n***** MonitorFactory.getHeader():");

        for (int i=0; i<header.length; i++)
 
    }
}

