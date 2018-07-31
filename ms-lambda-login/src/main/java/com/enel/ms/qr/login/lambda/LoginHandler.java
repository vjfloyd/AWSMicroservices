package com.enel.ms.qr.login.lambda;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.lambda.runtime.Context;
import com.enel.ms.qr.login.http.UserRequest;
import com.enel.ms.qr.login.http.UserResponse;

public class LoginHandler implements RequestHandler<UserRequest, LoginResponse> {


	@Override
	public LoginResponse handleRequest(UserRequest userRequest, Context context) {
		 // Create a connection to DynamoDB
        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.defaultClient();
        DynamoDB dynamoDB = new DynamoDB(client);

        // Get a reference to the Widget table
        Table table = dynamoDB.getTable("User");

        // Get our item by ID
        Item item = table.getItem("email", userRequest.getEmail());
        if(item != null) {
            System.out.println(item.toJSONPretty());

            // Return a new Widget object
            return new LoginResponse(userRequest.getEmail(), item.getString("name"));
        }
        else {
            return new LoginResponse();
        }
		//return new LoginResponse("Vj","SoftwareEngineer");
	}

	
}
