package MayBatch.MayApiBatch;

import org.json.JSONObject;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostMethodUsingJsonOrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject js =new JSONObject();
		js.put("name", "Anila");
		js.put("age", "28");
		js.put("Job", "QA");
		System.out.println(js.toString());
		Response res =
				given()
				.contentType(ContentType.JSON)
				.body(js.toString())
				.when()
				.post("http://localhost:3000/PythonStudents");
		System.out.println("Status code is "+ res.getStatusCode());
				
	}

}
