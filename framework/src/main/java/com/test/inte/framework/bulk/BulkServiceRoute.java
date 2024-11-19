package com.test.inte.framework.bulk;

import org.apache.camel.Exchange;
import org.apache.camel.spring.SpringRouteBuilder;
import org.apache.camel.Processor;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BulkServiceRoute extends SpringRouteBuilder {
	

	protected final Logger logger = LoggerFactory.getLogger(BulkServiceRoute.class);
	
	
	@SuppressWarnings("deprecation")
	public void configure() throws Exception {
		
		onException(Throwable.class).handled(true).process(new ErrorHandlingProcessor()).end();
		
		
		from("direct-vm:bulkInsert")
		.routeId("bulkInsert")
        .log("------------------> TEST <---------------- Route Id: bulkInsert");
		
	}
}
