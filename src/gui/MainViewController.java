package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {

	@FXML
	private MenuItem menuItemCommonAccount;
	
	@FXML
	private MenuItem menuEspecialAccount;
	
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	public void onMenuItemCommonAccount() {
		System.out.println("onMenuItemCommonAccount");
	}
	@FXML
	public void onMenuItemEspecialAccount() {
		System.out.println("onMenuItemEspecialAccount");
	}
	@FXML
	public void onMenuItemAboutAction() {
		System.out.println("onMenuItemAboutction");
	}
	
	
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		
		
	}

}
