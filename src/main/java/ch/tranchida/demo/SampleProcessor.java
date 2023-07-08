package ch.tranchida.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

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

        Map<String,String> map = new TreeMap<>();
        map.put("message", "rest is cool");
        map.put("data", data);
        exchange.getIn().setBody(map);

    }
    
}
