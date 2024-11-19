package com.test.inte.framework.bulk;

import org.apache.camel.spring.SpringRouteBuilder;


public class BulkServiceRouteBuilder extends SpringRouteBuilder {


	@Override
	public void configure() throws Exception {
		onException(Throwable.class).handled(true).process(new ErrorHandlingProcessor()).end();
		
		 from("cxfrs:bean:bulk?bindingStyle=SimpleConsumer")
		.routeId("bulk")
		.recipientList(simple("direct-vm:${header.operationName}")); 
	}
}
