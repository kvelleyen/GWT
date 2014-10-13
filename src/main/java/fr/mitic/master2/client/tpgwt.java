package fr.mitic.master2.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class tpgwt implements EntryPoint{
  
	
	IServicesAsync serv = GWT.create(IServices.class);
	
  public void onModuleLoad() {
	  
	  Button b = new Button("create Person", new ClickHandler() {
		
		public void onClick(ClickEvent arg0) {
			// TODO Auto-generated method stub
			
			serv.creatPersonne("toto", new AsyncCallback<Void>() {
				
				public void onSuccess(Void arg0) {
					Window.alert("enfin");
					// TODO Auto-generated method stub
					
				}
				
				public void onFailure(Throwable arg0) {
					Window.alert(arg0.getMessage());
					arg0.fillInStackTrace().printStackTrace();
					Window.alert(arg0.toString());
					
					// TODO Auto-generated method stub
					
				}
			});
		}
	});
	  
	  RootPanel.get().add(b);
	  
	 
	  }
}
