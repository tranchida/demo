package ch.tranchida.demo;

import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class SampleProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        
        Message in = exchange.getIn();
        String data = in.getHeader("data", String.class);

        Map<String,String> map = new LinkedHashMap<>();
        map.put("data", data);
        map.put("message", "rest is cool");
        exchange.getIn().setBody(map);

    }
    
}
