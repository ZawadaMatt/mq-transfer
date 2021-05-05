package com.github.zawadamatt.mqtransfer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MqTransferApplication {

    public static void main(String[] args) {
        SpringApplication.run(MqTransferApplication.class, args);
        System.out.println("done");
    }

}
