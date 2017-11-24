package xml2json;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;


public class XML2JSONRoute {

    public static void main(String[] args) throws Exception {

        CamelContext context = new DefaultCamelContext();
        context.addRoutes(new RouteBuilder() {
            public void configure() throws Exception {
                from("file:resource/XML").marshal().xmljson().to("file:resource/JSON");

            }
        });
        context.start();
        Thread.sleep(4000);
        context.stop();


    }
}
