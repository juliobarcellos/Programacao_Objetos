package edu.curso;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TesteFX extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pan = new Pane();
		Scene scn = new Scene(pan, 600, 400);

		Label txtTitulo = new Label("Login no Sistema");
		txtTitulo.relocate(100, 40);
		Font fnt = new Font(30);
		txtTitulo.setFont(fnt);

		Label txtUser = new Label("User ID");
		txtUser.relocate(100, 120);

		TextField lblUser = new TextField();
		lblUser.relocate(180, 120);

		Label txtPasswd = new Label("Password");
		txtPasswd.relocate(100, 200);

		TextField lblPasswd = new TextField();
		lblPasswd.relocate(180, 200);

		Button btnLogin = new Button("Login");
		btnLogin.relocate(100, 280);

		Button btnRegister = new Button("Registration");
		btnRegister.relocate(250, 280);

		pan.getChildren().addAll(txtTitulo, txtUser, lblUser, txtPasswd, lblPasswd, btnLogin, btnRegister);

		primaryStage.setScene(scn);
		primaryStage.setTitle("Login");
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(TesteFX.class, args);
	}
}
