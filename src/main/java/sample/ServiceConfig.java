package sample;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

	@Autowired
	private Bus bus;

	@Bean
	public Endpoint greeterServiceEndpoint() {
		EndpointImpl endpoint = new EndpointImpl(this.bus, new GreeterPortTypeImpl());
		endpoint.publish("/GreeterService");
		return endpoint;
	}

}
