package controllers;

import com.auth0.beans.Invoice;

import com.fasterxml.jackson.databind.JsonNode;

import java.math.BigDecimal;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.HashMap;

import play.libs.Json;

import play.mvc.Controller;
import play.mvc.Result;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.index.render());
    }

    public Result plainText(){
        return ok("This is just a text message");
    }

    public Result jsonMap(){
        HashMap<String, Object> result = new HashMap<String, Object>(){
            {
                put("str", "String");
                put("int", 123);
            }
        };
        return ok(Json.toJson(result));
    }

    public Result jsonObject(){
        Invoice invoice = new Invoice("Perico de los Palotes", "City", 
            "123456-7", "002245", LocalDate.now(), new BigDecimal(1293));
        
        return ok(Json.toJson(invoice));
    }

    public Result jsonCatch(){
        JsonNode jsonNode = request().body().asJson();
        Invoice invoice = Json.fromJson(jsonNode, Invoice.class);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return ok(invoice.getCode() + " | " + invoice.getIdNumber() + " | " + f.format(invoice.getDate()));
    }

    public Result jsonBadRequest(){
        JsonNode jsonNode = request().body().asJson();
        if(jsonNode == null){
            return badRequest("Expecting Json data");
        }else{
            Invoice invoice = Json.fromJson(jsonNode, Invoice.class);

            DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            return ok(invoice.getCode() + " | " + invoice.getIdNumber() + " | " + f.format(invoice.getDate()));
        }
    }

}
