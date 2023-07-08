package ch.tranchida.demo;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class Builder extends RouteBuilder {
    
    @Override
    public void configure() throws Exception {
        
        from("cxfrs:///?resourceClasses=ch.tranchida.demo.SampleService&bindingStyle=SimpleConsumer").process("sampleProcessor");

    }

}
