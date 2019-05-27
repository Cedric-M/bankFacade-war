/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bank.paymentmgmt.facade;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author ced
 */

@EJB
private BankingServiceRemote bankingService;

@RequestScoped
@Path("payment")
public class PaymentResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response pay(String content) {
    //affichage du corps de la requête POST.
    System.out.println(content);
    //retour d'une réponse sans corps indiquant un statut 202 : la requête 
    //a été acceptée mais le processus n'est pas terminé
    return Response.accepted().build();


    }
    
}
