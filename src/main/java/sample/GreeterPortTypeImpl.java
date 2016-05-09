package sample;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebService(targetNamespace = "http://sample/",
		serviceName = "GreeterService", portName = "GreeterPort",
		wsdlLocation = "wsdl/GreeterService.wsdl",
		endpointInterface = "sample.GreeterPortType")
public class GreeterPortTypeImpl implements GreeterPortType {

	private static final Logger logger = LoggerFactory.getLogger(
			GreeterPortTypeImpl.class);

	@Override
	public String greet(String name) {
		logger.info("Greeting {}...", name);
		return "Hello " + name + "!";
	}

}
