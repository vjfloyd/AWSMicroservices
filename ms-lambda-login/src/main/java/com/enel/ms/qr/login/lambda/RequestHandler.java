package com.enel.ms.qr.login.lambda;

import com.amazonaws.services.lambda.runtime.Context;

public interface RequestHandler <I, O>{
	
	public O handleRequest(I input, Context context);
}
