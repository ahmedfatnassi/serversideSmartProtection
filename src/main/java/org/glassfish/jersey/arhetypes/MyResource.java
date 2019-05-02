package org.glassfish.jersey.arhetypes;


import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.ContentType;
import com.sun.xml.internal.ws.api.server.Module;
import models.AdminEntity;
import models.CitizenEntity;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.json.JSONObject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
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
        System.out.println("1");
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "local" );
        System.out.println("2");
        EntityManager entitymanager = emfactory.createEntityManager( );
        System.out.println("3");
        entitymanager.getTransaction( ).begin( );
        entitymanager.flush();
        System.out.println("4");
        AdminEntity admin = new AdminEntity();
        admin.setPassword("0000");
        admin.setName("lkjln");

        admin.setCin("7218492");


        entitymanager.persist(admin);
        entitymanager.getTransaction().commit();
        //entitymanager.flush();
        System.out.println("created succefully ");
        /*User user2 = entitymanager.find( User.class,1);
        System.out.println("yyyyyyyyyyeaahhh "+user2.getEmail());*/
        entitymanager.close( );
        emfactory.close();
        return admin ;

    }
    @POST
    @Path("create")
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON,MediaType.APPLICATION_FORM_URLENCODED})
    public CitizenEntity createCitizen(String input ) {



        CitizenEntity citizenEntity =  new CitizenEntity();
        JSONObject jsonObj = new JSONObject(input);
        citizenEntity.setId(Integer.parseInt(jsonObj.getString("id")));
        citizenEntity.setFirstname(jsonObj.getString("firstname"));
        citizenEntity.setLastname(jsonObj.getString("lastname"));
        citizenEntity.setEmail(jsonObj.getString("email"));
        citizenEntity.setPhonenumber(jsonObj.getString("phonenumber"));
        citizenEntity.setPhonenumber2(jsonObj.getString("phonenumber2"));
        citizenEntity.setLocalizationH(Double.parseDouble(jsonObj.getString("localization_v")));
        citizenEntity.setLocalizationV(Double.parseDouble(jsonObj.getString("localization_h")));
        citizenEntity.setNumsocialsecurity(jsonObj.getString("securitysocial"));
        citizenEntity.setCin(jsonObj.getString("cin"));
        citizenEntity.setNearstHydrant(Integer.parseInt(jsonObj.getString("nearsthydrant")));
        citizenEntity.setFamilyNumber(jsonObj.getString("familyphonenumber"));
        citizenEntity.setNeighborPhone(jsonObj.getString("neighbornumber"));

        System.out.println(citizenEntity.getId());

        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "local" );

        EntityManager entitymanager = emfactory.createEntityManager( );

        entitymanager.getTransaction( ).begin( );



        entitymanager.flush();
        entitymanager.persist(citizenEntity);
        entitymanager.flush();
        entitymanager.getTransaction().commit();
        entitymanager.flush();
        System.out.println("created succefully ");
        entitymanager.close( );
        emfactory.close();

        return citizenEntity ;

    }
    @GET
    @Path("getlcitizenist")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON,MediaType.APPLICATION_FORM_URLENCODED})
    public  List<CitizenEntity> getAllCitizen() {

        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "local" );
        EntityManager entitymanager = emfactory.createEntityManager( );
        entitymanager.getTransaction( ).begin( );
        System.out.println("1");
        Query query = entitymanager.
                createQuery("Select p from CitizenEntity p");
        System.out.println("2");
        List<CitizenEntity> list = query.getResultList();
        System.out.println(3);
        System.out.println(list.get(1).getEmail());
        entitymanager.getTransaction().commit();
        System.out.println("4");
        entitymanager.close( );
        System.out.println("5");
        emfactory.close( );


        return list ;

    }

}
