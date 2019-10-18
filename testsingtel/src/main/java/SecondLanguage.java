import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/second")
 class SecondLanguage {

    static Map<String ,String> secondLan = presSet();

      static Map<String ,String> presSet(){
         secondLan.put("Danish","kykyliky");
         secondLan.put("Dutch","kukeleku");
         secondLan.put("Finnish","kukko");
         secondLan.put("French","kkkkaa");
         secondLan.put("German","kajhda");
         return secondLan;

     }

    @GET
    @Path("/{lan}")
    public Response getSound(@PathParam("lan") String lan) {
        String sound = secondLan.get(lan);
        return Response.status(200).entity(sound).build();

    }



}
