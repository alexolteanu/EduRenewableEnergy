package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
    TODO: https://spring.io/guides/gs/messaging-gcp-pubsub/
    https://cloud.google.com/appengine/docs/flexible/python/writing-and-responding-to-pub-sub-messages
    each time a wind turbine is created, a new topic is created

    discuss about data model
 */


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}