package fooddelievery.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import fooddelievery.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import fooddelievery.domain.*;

@Service
@Transactional
public class PolicyHandler{
    @Autowired OrderRepository orderRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='DeliveryStarted'")
    public void wheneverDeliveryStarted_UpdateOrderStatus(@Payload DeliveryStarted deliveryStarted){

        DeliveryStarted event = deliveryStarted;
        System.out.println("\n\n##### listener UpdateOrderStatus : " + deliveryStarted + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Acepted'")
    public void wheneverAcepted_UpdateOrderStatus(@Payload Acepted acepted){

        Acepted event = acepted;
        System.out.println("\n\n##### listener UpdateOrderStatus : " + acepted + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Rejected'")
    public void wheneverRejected_UpdateOrderStatus(@Payload Rejected rejected){

        Rejected event = rejected;
        System.out.println("\n\n##### listener UpdateOrderStatus : " + rejected + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='CookStarted'")
    public void wheneverCookStarted_UpdateOrderStatus(@Payload CookStarted cookStarted){

        CookStarted event = cookStarted;
        System.out.println("\n\n##### listener UpdateOrderStatus : " + cookStarted + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='CoookFinished'")
    public void wheneverCoookFinished_UpdateOrderStatus(@Payload CoookFinished coookFinished){

        CoookFinished event = coookFinished;
        System.out.println("\n\n##### listener UpdateOrderStatus : " + coookFinished + "\n\n");


        

        // Sample Logic //

        

    }

}


