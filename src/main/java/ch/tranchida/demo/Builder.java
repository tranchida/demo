package ch.tranchida.demo;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

@Component
public class Builder extends RouteBuilder {
    
    @Override
    public void configure() throws Exception {
        
        restConfiguration()
        .bindingMode(RestBindingMode.json)
        .dataFormatProperty("prettyPrint", "true")
        .apiContextPath("api-doc")
        .apiVendorExtension(true)
        .apiProperty("api.title", "User API")
        .apiProperty("api.version", "1.0.0")
        .apiProperty("cors", "true");;

        rest("/sampleService").
            get("/{data}").to("direct:sampleService");

        from("direct:sampleService").id("sampleService").process("sampleProcessor");

    }

}
