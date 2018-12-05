package com.capgemini.sankey.client;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class CallBacks implements AsyncCallback<CSVmodel> {

	@Override
	public void onFailure(Throwable caught) {
		Window.alert(caught.getMessage());
		
	}

	@Override
	public void onSuccess(CSVmodel result) {
		Window.alert(result.getWeight().toString());
	}

	

}
