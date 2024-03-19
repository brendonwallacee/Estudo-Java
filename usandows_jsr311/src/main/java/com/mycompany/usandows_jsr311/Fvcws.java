/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package com.mycompany.usandows_jsr311;

import com.google.gson.Gson;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Brendon
 */
@Path("fvcws")
public class Fvcws {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Fvcws
     */
    public Fvcws() {
    }

    /**
     * Retrieves representation of an instance of com.mycompany.usandows_jsr311.Fvcws
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getText() {
        //Testando o caminho pela url
        return "Teste";
    }
    
    @GET
    @Produces (MediaType.APPLICATION_JSON)
    @Consumes (MediaType.APPLICATION_JSON)
    @Path("/somar")
    public String somar(@QueryParam("v1") String v1, @QueryParam("v2") String v2){
        // Realizando calculo com entradas pela url e  trazendo resultado via JSON
        double vl1= Double.parseDouble(v1);
        double vl2= Double.parseDouble(v2);
        double res = vl1+vl2;
        return String.valueOf(res);
    }
    @POST
    @Produces (MediaType.APPLICATION_JSON)
    @Consumes (MediaType.APPLICATION_JSON)
    @Path("/subtrair")
    public String subtrair(@QueryParam("v1") String v1, @QueryParam("v2") String v2){
        // Realizando calculo com entradas pela url e  trazendo resultado via JSON com o metodo POST
        double vl1= Double.parseDouble(v1);
        double vl2= Double.parseDouble(v2);
        double res = vl1-vl2;
        return String.valueOf(res);
    }
    
    @POST
    @Produces (MediaType.APPLICATION_JSON)
    @Consumes (MediaType.APPLICATION_JSON)
    @Path("/objeto")
    public String getObjeto(@QueryParam("nome") String nome){
        // Trabalhando com criação de objetos através do método POST e a dependencia do google Gson
        Gson gson = new Gson();
        return (gson.toJson(new Aluno(1, nome)));
        
    }
    
    
    
    
    /**
     * PUT method for updating or creating an instance of Fvcws
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
