package org.gfg.server;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerDemo {

    public static void main(String[] args) {
        System.out.println("Enter your input");
        Scanner scanner = new Scanner(System.in);
        ExecutorService service = Executors.newFixedThreadPool(4);

        while (true){
            String data = scanner.nextLine();
            if(data.equalsIgnoreCase("exit")){
                System.exit(0);
            }
            service.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(" your data is  "+ data + "with threadName "+ Thread.currentThread().getName());
                }
            });
          }

    }
}
