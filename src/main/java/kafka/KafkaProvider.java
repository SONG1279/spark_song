package kafka;




import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;
import java.util.concurrent.ExecutionException;

public class KafkaProvider {

    public static void setProducer(){
        Properties kafkaProps = new Properties();
        kafkaProps.setProperty("bootstrap.servers","PLAINTEXT://192.168.1.100:9092");
        kafkaProps.setProperty("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        kafkaProps.setProperty("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        KafkaProducer<String, String> producer = new KafkaProducer<String, String>(kafkaProps);

        ProducerRecord<String, String> record =
                new ProducerRecord<String, String>("test","Precision products", "France");

        try {
            producer.send(record).get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }



    public static void main(String[] args) {
        setProducer();
    }
}

















