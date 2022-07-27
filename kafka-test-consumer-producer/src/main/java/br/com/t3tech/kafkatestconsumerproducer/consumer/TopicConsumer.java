package br.com.t3tech.kafkatestconsumerproducer.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class TopicConsumer {

    @Value("${topic.name.consumer}")
    private String topicName;

    @KafkaListener(topics = "${topic.name.consumer}", groupId = "group_id")
    public void consume(ConsumerRecord<String, String> payload){
    	
//    	log.info("Tópico: {}", topicName);
//        log.info("key: {}", payload.key());
//        log.info("Headers: {}", payload.headers());
//        log.info("Partion: {}", payload.partition());
//        log.info("Order: {}", payload.value());

    	System.out.printf("Tópico: %s %n", topicName);
    	System.out.printf("key: %s %n", payload.key());
    	System.out.printf("Headers: %s %n", payload.headers());
    	System.out.printf("Partion: %s %n", payload.partition());
    	System.out.printf("Order: %s %n", payload.value());
    	
    }

}