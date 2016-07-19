package com.allinpay.flow.demo;

public class ThreadTest
{
    public static void main(String[] args) throws Exception
    {

        final int i = 0;
        System.out.println("主线程：" + Thread.currentThread().getName());
        /*
         * Runnable r = new MyThread(); Thread t = new Thread(r); t.start();
         */

        new Thread() {
            public void run()
            {

                System.out.println(Thread.currentThread().getName());
            };
        }.start();
        Thread.sleep(10000);
        System.out.println("good");
    }

    static class MyThread extends Thread
    {
        @Override
        public void run()
        {
            System.out.println("2 线程：" + Thread.currentThread().getName());

            new Thread() {
                public void run()
                {
                    System.out.println("第3个线程：" + Thread.currentThread().getName());
                };
            }.start();
        }
    }

}
