package br.com.inmetrics.pilula.conhecimento;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private final Logger LOGGER = LoggerFactory.getLogger(HelloWorldController.class);

    @GetMapping("/")
    public ResponseEntity<Message> index() throws InterruptedException {
        final String msg = "Hello World";
        final Message helloWorld = new Message(msg);
        LOGGER.info(msg);
        return ResponseEntity.ok(helloWorld);
    }
}
