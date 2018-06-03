package com.abc.autoonduty;

import com.abc.autoonduty.crawler.UpsCrawler;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.IOException;

@Slf4j
@SpringBootApplication
@EnableScheduling
public class AutoondutyApplication{

	private final static Logger logger = LoggerFactory.getLogger(UpsCrawler.class);


	public static void main(String[] args) throws IOException {
		SpringApplication.run(AutoondutyApplication.class, args);


	}
	@Bean
	public DataLoader dataLoader() {
		return new DataLoader();
	}

	@Slf4j
	static class DataLoader implements CommandLineRunner {
		@Autowired
		UpsCrawler upsCrawler;

		@Override
		public void run(String... strings) throws Exception {
			logger.info("Loading ups web");
			upsCrawler.login();

		}
	}
}
