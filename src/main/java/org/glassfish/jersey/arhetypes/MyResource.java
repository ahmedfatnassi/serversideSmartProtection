package org.glassfish.jersey.arhetypes;

import models.AdminEntity;
import models.CitizenEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("he")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public AdminEntity getIt() {
       /* System.out.println("1");
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "local" );
        System.out.println("2");
        EntityManager entitymanager = emfactory.createEntityManager( );
        System.out.println("3");
        entitymanager.getTransaction( ).begin( );

        System.out.println("4");
        AdminEntity Citizen = new AdminEntity();
        Citizen.setPassword("0000");
        Citizen.setName("ahmed");
        Citizen.setName("fatnassi");


        entitymanager.persist(Citizen);
        entitymanager.getTransaction().commit();
        System.out.println("created succefully ");
        /*User user2 = entitymanager.find( User.class,1);
        System.out.println("yyyyyyyyyyeaahhh "+user2.getEmail());
        entitymanager.close( );
        emfactory.close( );*/
        AdminEntity Citizen = new AdminEntity();

        return Citizen ;

    }

}
