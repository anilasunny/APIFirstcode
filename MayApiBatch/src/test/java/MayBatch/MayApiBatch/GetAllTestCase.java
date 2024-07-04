package MayBatch.MayApiBatch;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetAllTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.when()
				.get("http://localhost:3000/APIStudents/290c");
				System.out.println("status code is");
				System.out.println(res.statusCode());
				System.out.println("the response is ");
				System.out.println(res.asString());
				System.out.println(res.getTime());
	}

}
