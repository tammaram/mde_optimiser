package uk.ac.kcl.client;

import com.github.gwtbootstrap.client.ui.NavLink;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

import uk.ac.kcl.client.constants.PageConstants;

public class NavBar extends Composite {

	private static NavBarUiBinder uiBinder = GWT.create(NavBarUiBinder.class);

	interface NavBarUiBinder extends UiBinder<Widget, NavBar> {
	}
	
	@UiField
	NavLink home;

	public NavBar() {
		initWidget(uiBinder.createAndBindUi(this));
		
		home.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// Refresh the page (go to home page) if user is not on the home page already.
				if (History.getToken() != PageConstants.WORKER_TOKEN) {
					Window.Location.reload();
				}
			}
		});
	}
}