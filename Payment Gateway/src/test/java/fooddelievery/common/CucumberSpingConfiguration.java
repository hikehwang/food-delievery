package fooddelievery.common;


import fooddelievery.PaymentGatewayApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { PaymentGatewayApplication.class })
public class CucumberSpingConfiguration {
    
}
