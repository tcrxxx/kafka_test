package br.com.t3tech.kafkatestconsumerproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class KafkaTestConsumerProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaTestConsumerProducerApplication.class, args);
	}

}
