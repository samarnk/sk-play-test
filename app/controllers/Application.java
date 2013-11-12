package controllers;

import model.Province;

import com.fasterxml.jackson.databind.JsonNode;

import play.*;
import play.libs.Json;
import play.libs.Jsonp;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {

  	return ok("Hello Play!");
  }
  
  
  public static Result provinces(String callback) {
  	System.err.println("Callback = " + callback);
  	
  	JsonNode json = Json.toJson(Province.findAllProvince());    
  	return ok(new Jsonp(callback,json));
  }

}
