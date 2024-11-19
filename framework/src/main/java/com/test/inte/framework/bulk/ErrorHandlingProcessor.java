package com.test.inte.framework.bulk;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ErrorHandlingProcessor implements Processor{

	protected final Class<?> className = ErrorHandlingProcessor.class;

	private Logger log = LoggerFactory.getLogger(className);

	@Override
	public void process(Exchange exchange) throws Exception {
		log.info("--> process Exception handler ");
		Exception exception = exchange.getProperty(Exchange.EXCEPTION_CAUGHT, Exception.class);
		
		log.error("Exception: " + exception.getMessage());
		log.error("-------> TEST <----- Exception: ", exception);	
	}
}
