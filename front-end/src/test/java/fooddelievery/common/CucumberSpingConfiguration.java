package fooddelievery.common;


import fooddelievery.FrontEndApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { FrontEndApplication.class })
public class CucumberSpingConfiguration {
    
}
