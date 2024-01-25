package org.example.bookmanagementservice;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookManagementServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookManagementServiceApplication.class, args);
    }



}
