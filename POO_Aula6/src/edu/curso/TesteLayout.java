package edu.curso;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TesteLayout extends Application {

	@Override
	public void start(Stage stg) throws Exception {
		BorderPane bp = new BorderPane();
		Scene scn = new Scene(bp, 700, 250);
		GridPane gp = new GridPane();
		FlowPane fp = new FlowPane();

		bp.setCenter(gp);

		Label lblID = new Label("ID");
		TextField txtID = new TextField();
//		txtID.setMaxWidth(2000);
		Label lblNome = new Label("Nome");
		TextField txtNome = new TextField();
		Label lblTel = new Label("Telefone");
		TextField txtTel = new TextField();

		gp.setHgap(50);
		gp.setVgap(20);
		gp.add(lblID, 1, 1);
		gp.add(txtID, 2, 1);
		gp.add(lblNome, 1, 2);
		gp.add(txtNome, 2, 2);
		gp.add(lblTel, 1, 3);
		gp.add(txtTel, 2, 3);
		gp.add(fp, 1, 4);

		Button btnSalvar = new Button("Salvar");
		Button btnPesq = new Button("Pesquisar");
		fp.getChildren().addAll(btnSalvar, btnPesq);
		fp.setMaxWidth(150);

		stg.setTitle("Cadastro");
		stg.setScene(scn);
		stg.show();
	}

	public static void main(String[] args) {
		Application.launch(TesteLayout.class, args);
	}
}
