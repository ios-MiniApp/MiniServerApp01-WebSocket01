package com.example.miniserverapp01websocket01;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Component
@Path("/test")
public class CommunicationTest {
    @GET
    public String getTest() { return "きました"; }
}
