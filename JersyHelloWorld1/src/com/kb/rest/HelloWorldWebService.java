package com.kb.rest;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
@Path("/hello")
public class HelloWorldWebService {
 
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessage(){
        return "Hello World";
       
    }
}