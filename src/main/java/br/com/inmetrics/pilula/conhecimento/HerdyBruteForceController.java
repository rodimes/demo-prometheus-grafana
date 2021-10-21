package br.com.inmetrics.pilula.conhecimento;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("brute")
public class HerdyBruteForceController {
    private static final String URL = "http://localhost:8080/";
    private static final String MSG = "Erick fazendo brute force !!!!!";
    private final Logger LOGGER = LoggerFactory.getLogger(HerdyBruteForceController.class);

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/force")
    public ResponseEntity<Message> bruteforce() throws InterruptedException {
        for (int i = 0; i < 100000; i++) {
            Thread.sleep(2L);
            ResponseEntity<String> forEntity = restTemplate.getForEntity(URL, String.class);
            LOGGER.info(MSG + forEntity.getBody());
        }
        return ResponseEntity.ok().build();
    }
}
