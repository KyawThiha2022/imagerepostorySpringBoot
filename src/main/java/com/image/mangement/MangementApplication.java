package com.image.mangement;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.image.mangement.service.FileStorageService;

import jakarta.annotation.Resource;

@SpringBootApplication
public class MangementApplication implements CommandLineRunner {

	@Resource
  FileStorageService storageService;
	public static void main(String[] args) {
		SpringApplication.run(MangementApplication.class, args);
	}
	@Override
  public void run(String... arg) throws Exception {

    storageService.init();
  }

}
