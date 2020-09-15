package gui;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.EspecialAccount;

public class EspacialAccountController implements Initializable {
	
	@FXML
	private TableView<EspecialAccount> tableViewEspecialAccount;
	
	@FXML
	private TableColumn<EspecialAccount, Integer> tableColumnId;
	
	@FXML
	private TableColumn<EspecialAccount, String> tableColumnName;
	
	@FXML
	private TableColumn<EspecialAccount, Integer> tableColumnEmail;
	
	@FXML
	private TableColumn<EspecialAccount, Double> tableColumnLimit;
	
	@FXML
	private TableColumn<EspecialAccount, Double> tableColumnBalance;
	
	@FXML
	private Button btNew;
	
	@FXML
	public void onBtNewAction() {
		System.out.println("tá funfando fommm");
	}
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
		
	}
	private void initializeNodes() {
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
		tableColumnName.setCellValueFactory(new PropertyValueFactory<>("nome"));
		tableColumnEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
		tableColumnBalance.setCellValueFactory(new PropertyValueFactory<>("balance"));
		tableColumnLimit.setCellValueFactory(new PropertyValueFactory<>("limit"));
		
		Stage stage = (Stage) Main.getMainScene().getWindow();
		tableViewEspecialAccount.prefHeightProperty().bind(stage.heightProperty());;
		
		
		
		
		
		
	}

}
