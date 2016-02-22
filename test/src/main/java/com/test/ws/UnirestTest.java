package com.test.ws;

import java.io.IOException;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class UnirestTest {
	public static void main(String[] args) throws IOException, UnirestException {
	HttpResponse<String> response = Unirest.post("https://api.instagram.com/oauth/access_token")
	  .header("cache-control", "no-cache")
	  .header("postman-token", "f498c952-3086-b4f7-597b-46a304a8039f")
	  .header("content-type", "application/x-www-form-urlencoded")
	  .body("client_id=e1d88356e0354feeb2d071de12feb856&client_secret=3c305b2e42e94b1f9c4758a7682055df&grant_type=authorization_code&redirect_uri=http%3A%2F%2Fshowuplondon.com%2F&code=89358e0f88514b24ac97a933d5de322b")
	  .asString();
	System.out.println("response status " +response.getStatus());
	System.out.println("response text " +response.getStatusText());
	//System.out.println("Raw body " +response.getRawBody());
	System.out.println("Body " +response.getBody());
	}
}
