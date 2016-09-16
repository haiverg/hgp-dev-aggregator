package com.redhat.training;

import javax.print.attribute.standard.Destination;

import org.apache.camel.builder.RouteBuilder;

public class JavaRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		from("file:in?noop=true")
		.process(new DestinationProcessor())
		.to("file:out");
			

	}

}
