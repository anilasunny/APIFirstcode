package MayBatch.MayApiBatch;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonSample {
	
	public static void main(String[] args) {
		JSONObject obj1 =new JSONObject();
		obj1.put("name","Anila");
		obj1.put("age","28");
		obj1.put("job", "QA");
		System.out.println(obj1.toString());
		// TODO Auto-generated method stub
		JSONObject obj2 =new JSONObject();
		obj2.put("name","Anitta");
		obj2.put("age","28");
		obj2.put("job", "Dev");
		System.out.println(obj2.toString());
		
		JSONArray A1 =new JSONArray();
		A1.put("Mango");
		A1.put("Apple");
		A1.put("Grape");
		System.out.println(A1.toString());
		
		String student = "{\"name\": \"Anila\",\"age\":\"28\",\"Job\":\"QA\"}";
		JSONObject obj3 =new JSONObject(student);
		String name =obj3.getString("name");
		int age =obj3.getInt("age");
		String Job =obj3.getString("Job");
		System.out.println("Name : " +name);
		System.out.println("Age : " +age);
		System.out.println("Job : "+Job);
		
		String jstring = "[\"apple\",\"mango\",\"grape\"]";
		JSONArray fruits =new JSONArray(jstring);
		for(int i =0;i<fruits.length();i++) {
			System.out.println(fruits.getString(i));
		}	
		
	}

}
