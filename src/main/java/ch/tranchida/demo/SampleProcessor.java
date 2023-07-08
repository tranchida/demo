package ch.tranchida.demo;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import jakarta.ws.rs.core.Response;

@Component
public class SampleProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        
        exchange.getIn().setBody("{ \"data\": \"Hello" + exchange.getIn().getHeader("data", String.class) + "\"}");

    }
    
}
