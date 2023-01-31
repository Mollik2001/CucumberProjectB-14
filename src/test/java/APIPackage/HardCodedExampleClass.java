package APIPackage;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class HardCodedExampleClass {

    // one thing to remember
    // base URI -base URl
    // end then using when keyword , we will send the end point

    String baseURI = RestAssured.baseURI = "http://hrm.syntaxtechs.net/syntaxapi/api";

    // we need to perform CRUD operation
    static String employee_id;
    String token= "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2NzQwODgyMDgsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTY3NDEzMTQwOCwidXNlcklkIjoiNDkxMyJ9._PwiP9_uwlAl5vyeVptb4mpfFwDEYUP65W9ag2kNw1A";

    @Test
    public void bgetOneEmployeed() {

            //prepare the request
            //to prepare the request, we use request specification
            RequestSpecification request = given().header("Authorization", token)
                    .header("Content-Type", "application/json")
                    .queryParam("employee_id", "47172A");

            //to hit the end point/ to make the request which will return response
            Response response = request.when().get("/getOneEmployee.php");

            //System.out.println(response.asString());

                 response.prettyPrint();

            //verifying the status code
            response.then().assertThat().statusCode(200);



        }

    @Test
public void acreateEmployee() {
        RequestSpecification request = given().header("Authorization", token)
                .header("Content-Type", "application/json").
                body("{\n" +
                        "  \"emp_firstname\": \"Mollik\",\n" +
                        "  \"emp_lastname\": \"S\",\n" +
                        "  \"emp_middle_name\": \"Miya\",\n" +
                        "  \"emp_gender\": \"M\",\n" +
                        "  \"emp_birthday\": \"2001-04-05\",\n" +
                        "  \"emp_status\": \"active!\",\n" +
                        "  \"emp_job_title\": \"QA Engineer\"\n" +
                        "}");
        Response response = request.when().post("/createEmployee.php");
        response.prettyPrint();
        //verfying the statuys code which is 201
        response.then().assertThat().statusCode(201);
        //getting the employee id from the response and use it as static one
        employee_id = response.jsonPath().getString(employee_id);
        System.out.println(employee_id);


    }

    }